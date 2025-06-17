package com.deybi.login.navigation

import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.deybi.login.presentation.screen.LoginScreen
import com.deybi.login.presentation.viewmodel.LoginViewModel


fun NavGraphBuilder.loginGraph(
    navController: NavHostController,
    onSuccess: () -> Unit,
    onRegister: () -> Unit
) {

    composable(LoginRoutes.LOGIN) {
        val viewModel: LoginViewModel = hiltViewModel()
        val uiState by viewModel.uiState.collectAsState()

        LoginScreen(
            uiState = uiState,
            onEmailChange = viewModel::onEmailChange,
            onPasswordChange = viewModel::onPasswordChange,
            onLoginClick = viewModel::login,
            onRegisterClick = onRegister,
            onSuccess = onSuccess
        )
    }

}