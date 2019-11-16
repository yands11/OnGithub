package com.blank.ongithub

import android.app.Application
import com.blank.ongithub.koin.apiModule
import com.blank.ongithub.koin.networkModule
import com.blank.ongithub.koin.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import timber.log.Timber


class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        setupTimber()
        setupKoin()
    }

    private fun setupTimber() {
        Timber.plant(Timber.DebugTree())
    }

    private fun setupKoin() {
        startKoin {
            androidContext(this@MyApp)
            modules(listOf(networkModule))
            modules(listOf(apiModule))
            modules(listOf(viewModelModule))
        }
    }
}