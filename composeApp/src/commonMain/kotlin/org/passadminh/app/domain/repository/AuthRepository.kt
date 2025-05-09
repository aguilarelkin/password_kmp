package org.passadminh.app.domain.repository

interface AuthRepository {
    suspend fun signInWithEmail(email: String, password: String): Boolean
}