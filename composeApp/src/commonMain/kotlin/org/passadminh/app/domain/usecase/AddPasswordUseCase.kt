package org.passadminh.app.domain.usecase

import org.passadminh.app.domain.model.Password
import org.passadminh.app.domain.repository.PasswordRepository

class AddPasswordUseCase(private val repository: PasswordRepository) {
    suspend operator fun invoke(password: Password) {
        repository.addPassword(password)
    }
}