package com.example.dagger.di

import com.example.dagger.Car
import com.example.dagger.MainActivity
import dagger.Component

@Component
interface AppComponent {
//    fun getCar(): Car

    fun inject(activity: MainActivity)
}