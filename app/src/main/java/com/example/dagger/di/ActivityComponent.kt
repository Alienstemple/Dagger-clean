package com.example.dagger.di

import com.example.dagger.MainActivity
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Named

@PerActivity
@Subcomponent(modules = [WheelsModule::class, PetrolEngineModule::class])
interface ActivityComponent {
//    fun getCar(): Car

    fun inject(activity: MainActivity)

    @Subcomponent.Factory
    interface Factory {
        fun create(
            @BindsInstance @Named("horsePower") horsePower: Int,
            @BindsInstance @Named("engineCapacity") engineCapacity: Int,
        ): ActivityComponent
    }
}