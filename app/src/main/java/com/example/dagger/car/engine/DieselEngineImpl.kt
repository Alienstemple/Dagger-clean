package com.example.dagger.car.engine

import android.util.Log
import javax.inject.Inject

class DieselEngineImpl @Inject constructor(): Engine {
    override fun start() {
        Log.d("TAG", "Diesel started")
    }
}