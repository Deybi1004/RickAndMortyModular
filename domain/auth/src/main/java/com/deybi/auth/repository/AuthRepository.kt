package com.deybi.auth.repository

interface AuthRepository {
    suspend fun login(email: String, password: String): Result<Boolean>
    fun logout()
}