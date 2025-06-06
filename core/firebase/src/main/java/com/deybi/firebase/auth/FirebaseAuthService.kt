package com.deybi.firebase.auth

interface FirebaseAuthService {
    suspend fun login(email: String, password: String): Result<Boolean>
    fun logout()
}