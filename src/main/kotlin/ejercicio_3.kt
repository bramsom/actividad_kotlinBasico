package org.example

fun main() {
    val celsius:Double=27.0
    val kelvin:Double=350.0
    val Fahrenheit:Double=10.0
    printFinalTemperature(celsius,"celsius","Fahrenheit", ::celsiusAFahrenheit)
    printFinalTemperature(kelvin,"kelvin", "celsius", ::kelvinACelsius)
    printFinalTemperature(Fahrenheit,"Fahrenheit","kelvin", ::fahrenheitACelsius)
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two
    println("$initialMeasurement grados $initialUnit son $finalMeasurement grados $finalUnit.")
}
fun celsiusAFahrenheit(celsius: Double): Double {
    return celsius * 9/5 + 32
}

fun kelvinACelsius(kelvin: Double): Double {
    return kelvin - 273.15
}

fun fahrenheitACelsius(fahrenheit: Double): Double {
    return (fahrenheit - 32) * 5/9
}