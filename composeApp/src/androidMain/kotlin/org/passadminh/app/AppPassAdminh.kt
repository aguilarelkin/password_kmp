package org.passadminh.app

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.passadminh.app.di.appModule

class AppPassAdminh : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@AppPassAdminh)
            modules(appModule)
        }
    }
}