package com.deybi.firebase.auth

interface FirebaseAuthService {
    suspend fun login(email: String, password: String): Boolean
    fun logout()
}