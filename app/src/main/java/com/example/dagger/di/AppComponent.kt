package com.example.dagger.di

import com.example.dagger.car.Driver
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {
    // поставляем Driver, кот долж быть singleton
    fun getDriver(): Driver
}