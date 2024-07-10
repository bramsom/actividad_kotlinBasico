package org.example

fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)
    amanda.showProfile()
    atiqah.showProfile()
}
class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        println("nombre:$name")
        println("edad:$age")
        println("pasa tiempo: $hobby")
        println("descripcion: $referrer")
        println()
    }
}