fun main() {

    val name= "Jenaro"
    val apellido = "Fernandez"
    val compania = "PMG"
    val edad = "48"

    //Creacion de un Array

    val myArray = arrayListOf<String>()

    //Añadir datos de 1 en 1

    myArray.add(name)
    myArray.add(apellido)
    myArray.add(compania)
    myArray.add(edad)

    //Añadir conjunto de datos
    myArray.addAll(listOf("Hola","Bienvenido al tutorial"))

    println(myArray)
    //Eliminar datos

    myArray.removeAt(4)

    println(myArray)

    println(myArray[0])

    // Recorrer array
    myArray.forEach {
        println(it)
    }
}