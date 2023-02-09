package com.example.dagger

import android.util.Log
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