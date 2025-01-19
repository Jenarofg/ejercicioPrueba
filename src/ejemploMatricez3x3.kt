fun main() {
    val matriz: Array<Array<Char?>> = Array(3){arrayOfNulls(3)}


    for (fila in matriz){
        println(fila.joinToString(" ")
        { it?.toString() ?: "X" })
    }
}