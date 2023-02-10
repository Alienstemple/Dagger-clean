package com.example.dagger.car

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Driver @Inject constructor() {
    init {
        Log.d("TAG", "Driver created")
    }
}