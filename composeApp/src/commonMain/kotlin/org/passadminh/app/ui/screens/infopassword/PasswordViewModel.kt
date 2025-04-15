package org.passadminh.app.ui.screens.infopassword

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import org.passadminh.app.domain.model.Password
import org.passadminh.app.domain.usecase.AddPasswordUseCase

class PasswordViewModel(private val addPasswordUseCase: AddPasswordUseCase):ViewModel() {
/*    private val _state = MutableStateFlow (PasswordUiState())
    val state: StateFlow<PasswordUiState> = _state

    fun addPassword(password: Password) {
        viewModelScope.launch {
            _state.value = _state.value.copy(isLoading = true)
            try {
                addPasswordUseCase(password)
                _state.value = _state.value.copy(success = true)
            } catch (e: Exception) {
                _state.value = _state.value.copy(error = e.message)
            }
        }
    }*/
}