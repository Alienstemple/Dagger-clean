package com.example.dagger.car

import javax.inject.Inject

class Wheels @Inject constructor(val rims: Rims, val tires: Tires) {
}