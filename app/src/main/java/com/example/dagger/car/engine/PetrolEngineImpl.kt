package com.example.dagger.car.engine

import android.util.Log
import com.example.dagger.car.engine.Engine
import javax.inject.Inject

class PetrolEngineImpl @Inject constructor(): Engine {
    override fun start() {
        Log.d("TAG", "Petrol started")
    }
}