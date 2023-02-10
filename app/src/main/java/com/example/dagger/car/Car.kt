package com.example.dagger.car

import android.util.Log
import com.example.dagger.car.engine.Engine
import com.example.dagger.di.PerActivity
import javax.inject.Inject

@PerActivity
class Car @Inject constructor(val wheels: Wheels, val driver: Driver) {

    @Inject
    lateinit var engine: Engine

    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }

    fun drive() {
        engine.start()
        Log.d("TAG", "Driver $driver drives car $this")
    }
}