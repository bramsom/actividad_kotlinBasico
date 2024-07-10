package org.example

fun main() {
    val child = 5
    val adult = 28
    val senior = 87
    val isMonday = true
    println("El precio de la entrada al cine para una persona mayor a. $child es \$${ticketPrice(child, isMonday)}.")
    println("El precio de la entrada al cine para una persona mayor a $adult es \$${ticketPrice(adult, isMonday)}.")
    println("El precio de la entrada al cine para una persona mayor a $senior es \$${ticketPrice(senior, isMonday)}.")
}
fun ticketPrice(age: Int, isMonday: Boolean): Int {
    return when {
        age <= 12 -> 15
        age > 12 && age <= 60 -> {
            if (isMonday) {
                25
            } else {
                30
            }
        }
        age >60 && age <=100 -> 20
        else -> {
            0
        }
    }
}
