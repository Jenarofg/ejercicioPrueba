package EjerciciosDAM

fun main() {
    println("Introduce la primera palabra: ")
    val palabra1=readln()
    println("Introduce la segunda palabra: ")
    val palabra2=readln()

    if (palabra1.lowercase().toCharArray().sorted()==palabra2.lowercase().toCharArray().sorted()){
        println("Estas palabras son anagrama")
    }else {
        println("No son anagrama")
    }
}