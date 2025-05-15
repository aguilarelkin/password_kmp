package org.passadminh.app.domain.repository

interface GoogleSignInService {
    suspend fun signInWithGoogle(idToken: String): Boolean
}