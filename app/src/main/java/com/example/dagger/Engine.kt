package com.example.dagger

import android.util.Log
import javax.inject.Inject

class Engine @Inject constructor() {
    init {
        Log.d("TAG", "Engine created")
    }
}