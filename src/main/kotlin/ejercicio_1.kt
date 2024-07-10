package org.example

fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}
fun printNotificationSummary(numberOfMessages: Int) {
    if (numberOfMessages>=100) {
        println("tu telefono esta explotando! tienes 99+ mensajes")
    }else if(numberOfMessages<=100){
        println("tienes  $numberOfMessages mensajes")
    }
    else{
        println("datos no validos")
    }

}
