package org.passadminh.app.domain.repository

import org.passadminh.app.domain.model.Password

interface PasswordRepository {
    abstract fun addPassword(password: Password)
}