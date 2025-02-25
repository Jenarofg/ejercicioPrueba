package EjerciciosDAM
/*
    Por lo general, la pantalla del teléfono se enciende y se apaga cuando
    se presiona el botón de encendido. En cambio, si un teléfono plegable
    está plegado, su pantalla interna principal no se enciende cuando se
    presiona el botón de encendido.

    En el código inicial que se proporciona en el siguiente fragmento de
    código, escribe una clase FoldablePhone que se herede de la clase Phone.
    Debe contener lo siguiente:

    Una propiedad que indique si el teléfono está plegado
    Un comportamiento de función switchOn() diferente del de la clase Phone
    para que solo encienda la pantalla cuando el teléfono no esté plegado
    Métodos para cambiar el estado de plegado
 */

fun main() {
    val newFoldablePhone = FoldablePhone()

    newFoldablePhone.switchOn()
    newFoldablePhone.checkPhoneScreenLight()
    newFoldablePhone.unfold()
    newFoldablePhone.switchOn()
    newFoldablePhone.checkPhoneScreenLight()
}

open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(var isFolded: Boolean = true): Phone() {
    override fun switchOn() {
        if (!isFolded) {
            isScreenLightOn = true
        }
    }

    fun fold() {
        isFolded = true
    }

    fun unfold() {
        isFolded = false
    }
}
