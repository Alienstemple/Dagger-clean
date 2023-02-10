package com.example.dagger.di

import com.example.dagger.MainActivity
import dagger.Component

@Component (modules = [WheelsModule::class, DieselEngineModule::class])
interface AppComponent {
//    fun getCar(): Car

    fun inject(activity: MainActivity)
}