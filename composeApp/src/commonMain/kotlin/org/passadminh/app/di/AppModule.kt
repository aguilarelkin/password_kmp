package org.passadminh.app.di

import org.koin.dsl.module

val appModule = module {
    single { "Hola desde Koin" }
}