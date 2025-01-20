package EjerciciosDAM

/*
    A menudo, debes completar los perfiles de sitios web en línea que
    contienen campos obligatorios y no obligatorios. Por ejemplo, puedes
    agregar tu información personal y un vínculo a otras personas que
    te refirieron para que registraras tu perfil.

    En el código inicial que se proporciona en el siguiente fragmento de
    código, escribe un programa que imprima los detalles del perfil de
    una persona.
 */

fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        println("Name: $name")
        println("Age: $age")
        if(hobby != null) {
            print("Likes to $hobby. ")
        }
        if(referrer != null) {
            print("Has a referrer named ${referrer.name}")
            if(referrer.hobby != null) {
                print(", who likes to ${referrer.hobby}.")
            } else {
                print(".")
            }
        } else {
            print("Doesn't have a referrer.")
        }
        print("\n\n")
    }
}