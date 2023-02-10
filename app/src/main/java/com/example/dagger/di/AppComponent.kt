package com.example.dagger.di

import com.example.dagger.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

@Component (modules = [WheelsModule::class, PetrolEngineModule::class])
interface AppComponent {
//    fun getCar(): Car

    fun inject(activity: MainActivity)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun horsePower(@Named("horsePower") horsePower: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("engineCapacity") engineCapacity: Int): Builder

        fun build(): AppComponent
    }
}