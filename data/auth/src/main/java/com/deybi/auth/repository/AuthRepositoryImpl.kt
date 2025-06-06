package com.deybi.auth.repository

import com.deybi.firebase.auth.FirebaseAuthService
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(
    private val firebaseAuthService: FirebaseAuthService
) : AuthRepository {
    override suspend fun login(email: String, password: String): Boolean {
        return firebaseAuthService.login(email, password)
    }

    override fun logout() {
        firebaseAuthService.logout()
    }
}