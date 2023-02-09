package com.example.dagger.di

import com.example.dagger.car.Rims
import com.example.dagger.car.Tires
import com.example.dagger.car.Wheels
import dagger.Module
import dagger.Provides

@Module
class WheelsModule {
    @Provides
    fun provideRims() = Rims()

    @Provides
    fun provideTires() = Tires().also { it.inflate() }

    @Provides
    fun provideWheels(rims: Rims, tires: Tires) = Wheels(rims, tires)
}