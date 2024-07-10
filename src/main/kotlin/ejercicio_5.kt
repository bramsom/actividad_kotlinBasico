package org.example

/*class Phone(var isScreenLightOn: Boolean = false) {
    open  fun switchOn() {
        isScreenLightOn = true
    }

    open fun switchOff() {
        isScreenLightOn = false
    }

    open fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(isScreenLightOn: Boolean = false, var isFolded: Boolean = false) : Phone(isScreenLightOn) {

    override fun switchOn() {
        if (!isFolded) {
            isScreenLightOn = true
        } else {
            println("Cannot switch on. The phone is folded.")
        }
    }

    fun fold() {
        isFolded = true
        println("The phone is now folded.")
    }

    fun unfold() {
        isFolded = false
        println("The phone is now unfolded.")
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
}*/