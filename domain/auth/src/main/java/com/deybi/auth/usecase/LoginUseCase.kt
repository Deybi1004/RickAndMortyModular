package com.deybi.auth.usecase

import com.deybi.auth.repository.AuthRepository
import javax.inject.Inject

class LoginUseCase @Inject constructor(
    private val repository: AuthRepository
) {
    suspend operator fun invoke(email: String, password: String): Result<Boolean> {
        return repository.login(email, password)
    }
}