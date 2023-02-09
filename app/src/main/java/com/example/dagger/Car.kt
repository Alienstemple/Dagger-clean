package com.example.dagger

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(val wheels: Wheels, val engine: Engine) {
    fun drive() {
        Log.d("TAG", "Driving")
    }
}