package com.example.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dagger.car.Car
import com.example.dagger.di.DaggerAppComponent
import com.example.dagger.di.DieselEngineModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerAppComponent
            .builder()
            .horsePower(200)
            .engineCapacity(1500)
            .build()

        component.inject(this)

        car.drive()
    }
}