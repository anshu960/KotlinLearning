package com.example.kotlinbasics

import java.util.*

fun main() {
    MobilePhone("Android", "Realme", "Realme XT")
}
class MobilePhone(osName: String, brand: String, model: String){
    init {
        println("OSname : $osName")
        println("Brand : $brand")
        println("Model : $model")
    }
}
