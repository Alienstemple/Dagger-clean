package com.example.dagger.car.engine

import android.util.Log

class DieselEngineImpl (private val horsePower: Int): Engine {
    override fun start() {
        Log.d("TAG", "Diesel started. horsePower = $horsePower")
    }
}