package com.example.dagger.car.engine

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class PetrolEngineImpl @Inject constructor(
    @Named("horsePower") private val horsePower: Int,
    @Named("engineCapacity") private val engineCapacity: Int,
) : Engine {
    override fun start() {
        Log.d("TAG", "Petrol started. horsePower = $horsePower, engCapac = $engineCapacity")
    }
}