import java.util.Scanner

fun main() {
    try {
        val valor = readln().toDouble()
    }catch (e: NumberFormatException) {
        println("Error: No se puede convertir  a un número.")
    }
}

fun conversion (valor: Double, tipo: String) {



    var medidaFinal: Double= when (tipo) {
        "f" -> 5.0 / 9.0 * (valor - 32) + 273.15
        "c" -> valor * 9.0 / 5.0 + 32
        else -> valor - 273.15

    }

    var medidaFinalString: String = String.format("%.2f", medidaFinal)
    println("$valor grados $tipo son $medidaFinal")
}