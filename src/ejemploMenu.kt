import java.util.Scanner

fun main() {
    menu()
}

fun menu () {
    val scanner = Scanner(System.`in`)
    var menu = true
    var opcion: Int? = null
    do {
        println("1.Leer caracteres")
        println("2.Escribir caracteres")
        println("3.Borrar caracteres")
        println("4.Añadir caracteres")
        println("0.Salir caracteres")

        println("Introduce la opcion deseada: ")
        val teclado = scanner.nextLine()

        opcion = teclado.toIntOrNull()
        if (opcion == null || opcion !in 0..4) {
            println("Opción no válida. Por favor, elige una opción del 1 al 4.")
            println()
            continue
        }
        when (teclado) {
            "1" -> println("Ha elegido la opcion 1")
            "2" -> println("Ha elegido la opcion 2")
            "3" -> println("Ha elegido la opcion 3")
            "4" -> println("Ha elegido la opcion 0")
            "0" -> {menu=false}
        }

    }while(menu)
}