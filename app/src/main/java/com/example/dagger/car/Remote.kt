package com.example.dagger.car

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor() {
    fun setListener(car: Car) {
        Log.d("TAG", "Remote connected")
    }
}