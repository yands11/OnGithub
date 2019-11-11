package com.blank.ongithub

import android.app.Application
import com.blank.ongithub.koin.networkModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin


class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        setupKoin()
    }

    private fun setupKoin() {
        startKoin {
            androidContext(this@MyApp)
            modules(listOf(networkModule))
        }
    }
}