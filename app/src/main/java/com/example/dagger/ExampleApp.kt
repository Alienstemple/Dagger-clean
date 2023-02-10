package com.example.dagger

import android.app.Application
import com.example.dagger.di.ActivityComponent
import com.example.dagger.di.AppComponent
import com.example.dagger.di.DaggerAppComponent

class ExampleApp: Application() {
    private lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()

    }
    fun getComponent() = appComponent
}