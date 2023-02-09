package com.example.dagger.di

import com.example.dagger.car.engine.Engine
import com.example.dagger.car.engine.PetrolEngineImpl
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class PetrolEngineModule {
    @Binds
    abstract fun bindPetrolEngine(petrolEngineImpl: PetrolEngineImpl): Engine
}