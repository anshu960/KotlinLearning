package com.example.kotlinbasics

fun main() {
    Mobile("Android", "Samsung", "Galaxy S20 Ultra")
    Mobile("IOS", "Apple", "Iphone 12")
}
class Mobile(OSname:String,brand:String,model:String) {
    init {
        println("Mobile: $OSname")
        println("Mobile: $brand")
        println("Mobile: $model")

    }

}