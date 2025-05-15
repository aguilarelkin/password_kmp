package org.passadminh.app.di

import org.koin.dsl.module
import org.passadminh.app.data.AuthRepositoryImpl
import org.passadminh.app.domain.repository.AuthRepository
import org.passadminh.app.domain.repository.GoogleSignInService
import org.passadminh.app.ui.screens.login.AuthViewModel

val appModule = module {
    single { "Hola desde Koin" }
    single<AuthRepository> { AuthRepositoryImpl() }
    single {
        AuthViewModel(
            get(

            )
        )
    }
}