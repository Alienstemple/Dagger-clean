package com.example.dagger.di

import com.example.dagger.car.engine.DieselEngineImpl
import com.example.dagger.car.engine.Engine
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule(private val horsePower: Int) {
    @Provides
    fun provideDieselEngine(): Engine = DieselEngineImpl(horsePower)
}