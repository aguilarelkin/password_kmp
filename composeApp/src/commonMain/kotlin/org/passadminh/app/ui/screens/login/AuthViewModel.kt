package org.passadminh.app.ui.screens.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import org.passadminh.app.domain.repository.AuthRepository

class AuthViewModel(private val repository: AuthRepository) : ViewModel() {
    val isLoggedIn = MutableStateFlow(false)

    fun login(email: String, password: String) {
        viewModelScope.launch {
            isLoggedIn.value = repository.signInWithEmail(email, password)
        }
    }
}