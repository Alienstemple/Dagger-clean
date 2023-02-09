package com.example.dagger.car

import android.util.Log
import com.example.dagger.car.engine.Engine
import javax.inject.Inject

class Car @Inject constructor(val wheels: Wheels) {

    @Inject
    lateinit var engine: Engine

    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }

    fun drive() {
        Log.d("TAG", "Driving")
    }
}