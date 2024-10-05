package com.example.dependencyinjection.di

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApplication:Application() {
    override fun onCreate() {
        super.onCreate()
        val listModule= listOf(Module().module)
        startKoin {
            androidContext(this@MyApplication)
            modules(listModule)
        }
    }

}