fun main() {

    val listaNumeros = listOf<Int>(2,-3,7,-3,8,10,-22)
    println(positivos(listaNumeros))
}

fun positivos(lista: List<Int>): List<Int> {
    return lista.filter { it >= 0 }
}




