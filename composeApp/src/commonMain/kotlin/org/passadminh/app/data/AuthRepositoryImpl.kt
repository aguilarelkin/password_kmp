package org.passadminh.app.data

import dev.gitlive.firebase.Firebase
import dev.gitlive.firebase.auth.auth
import org.passadminh.app.domain.repository.AuthRepository

class AuthRepositoryImpl : AuthRepository {
    override suspend fun signInWithEmail(email: String, password: String): Boolean {
        return runCatching {
            Firebase.auth.signInWithEmailAndPassword(email, password)
        }.isSuccess
    }
}


