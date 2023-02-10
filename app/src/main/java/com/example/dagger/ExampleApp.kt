package com.example.dagger

import android.app.Application
import com.example.dagger.di.ActivityComponent
import com.example.dagger.di.AppComponent
import com.example.dagger.di.DaggerAppComponent
import com.example.dagger.di.DriverModule

class ExampleApp: Application() {
    private lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.factory().create(DriverModule("Neo"))

    }
    fun getComponent() = appComponent
}