package com.example.kotlinbasics
fun main() {
    /* val age =19

    if (age >= 21){
        println("Now you may drink in the INDIA")
    }else if (age >=18){
        println("You can Vote")

    }else if (age<=16){
        println("you can Drive")
    }
    else{
        println("You're too young")
    }

var Season = 4
    when(Season){
        1-> println("Summer")
        2-> println("Winter")
        3-> println("Spring")
        4-> {
            println("Fall")
            println("Rainy")
        }
    }

var month = 3
    when(month){
      in 3..5 -> println("Summer")
      in 6..8 -> println("Rainy")
      in 9..11 -> println("Winter")
        in 12 downTo 2 -> println("Spring")

    }
}*/

    var x: Any = 13.25.toInt()
    when (x) {
       is Double -> println("$x is double")
        is String -> println("$x is String")
        is Int -> println("$x is int")
    }
}





