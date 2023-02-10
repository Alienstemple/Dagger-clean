package com.example.dagger.di

import com.example.dagger.car.engine.DieselEngineImpl
import com.example.dagger.car.engine.Engine
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule(private val horsePower: Int) {
    @Provides
    fun provideHorsePower(): Int = horsePower

    @Provides
    fun provideDieselEngine(engine: DieselEngineImpl): Engine = engine
}