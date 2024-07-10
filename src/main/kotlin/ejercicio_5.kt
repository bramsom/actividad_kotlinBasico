package org.example

open class Phone(var isScreenLightOn: Boolean = false) {
    open fun switchOn() {
        isScreenLightOn = true
    }

     fun switchOff() {
        isScreenLightOn = false
    }

     fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "encendida" else "apagada"
        println("La luz de la pantalla del teléfono esta $phoneScreenLight.")
    }
}

class FoldablePhone(isScreenLightOn: Boolean = false, var isFolded: Boolean = false) : Phone(isScreenLightOn) {

    override fun switchOn() {
        if (!isFolded) {
            isScreenLightOn = true
        } else {
            println("No se puede encender. el telefono esta doblado.")
        }
    }

    fun fold() {
        isFolded = true
        println("El teléfono ahora está doblado..")
    }

    fun unfold() {
        isFolded = false
        println("El teléfono ahora está desplegado.")
    }
}

fun main() {
    val foldablePhone = FoldablePhone()

    // Intentar encender el teléfono cuando está plegado
    foldablePhone.fold()
    foldablePhone.switchOn()
    foldablePhone.checkPhoneScreenLight()

    // Desplegar el teléfono y encenderlo
    foldablePhone.unfold()
    foldablePhone.switchOn()
    foldablePhone.checkPhoneScreenLight()

    // Apagar el teléfono
    foldablePhone.switchOff()
    foldablePhone.checkPhoneScreenLight()
}