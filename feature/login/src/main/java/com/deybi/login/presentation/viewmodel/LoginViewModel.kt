package com.deybi.login.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.deybi.auth.usecase.LoginUseCase
import com.deybi.login.presentation.state.LoginUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val loginUseCase: LoginUseCase,
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
) : ViewModel() {

    private val _uiState = MutableStateFlow<LoginUiState>(LoginUiState())
    val uiState: StateFlow<LoginUiState> = _uiState

    fun onEmailChange(newEmail: String) {
        _uiState.update { it.copy(email = newEmail) }
    }

    fun onPasswordChange(newPassword: String) {
        _uiState.update { it.copy(password = newPassword) }
    }

    fun login() {
        val email = _uiState.value.email
        val password = _uiState.value.password

        viewModelScope.launch(ioDispatcher) {
            _uiState.update { it.copy(isLoading = true, errorMessage = null) }

            val result = loginUseCase(email, password)

            result.onSuccess { success ->
                _uiState.update {
                    it.copy(
                        isLoading = false,
                        isSuccess = success,
                        errorMessage = if (success) null else LoginErrorMessages.INVALID_CREDENTIALS
                    )
                }
            }.onFailure { e ->
                _uiState.update {
                    it.copy(
                        isLoading = false,
                        isSuccess = false,
                        errorMessage = e.localizedMessage ?: LoginErrorMessages.UNKNOWN_ERROR
                    )
                }
            }
        }
    }

}

object LoginErrorMessages {
    const val INVALID_CREDENTIALS = "Invalid email or password."
    const val UNKNOWN_ERROR = "Unknown error."
}