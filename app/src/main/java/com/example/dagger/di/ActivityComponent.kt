package com.example.dagger.di

import com.example.dagger.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

@PerActivity
@Component (dependencies = [AppComponent::class], modules = [WheelsModule::class, PetrolEngineModule::class])
interface ActivityComponent {
//    fun getCar(): Car

    fun inject(activity: MainActivity)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun horsePower(@Named("horsePower") horsePower: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("engineCapacity") engineCapacity: Int): Builder

        fun appComponent(component: AppComponent): Builder

        fun build(): ActivityComponent
    }
}