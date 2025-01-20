package EjerciciosDAM

/*
    Imagina que necesitas crear una app de reproducción de música.

    Crea una clase que pueda representar la estructura de una canción.
    La clase Song debe incluir estos elementos de código:

    Propiedades para el título, el artista, el año de publicación y el
    recuento de reproducciones mPropiedad que indica si la canción es
    popular (si el recuento de reproducciones es inferior a 1,000,
    considera que es poco popular).
    Un método para imprimir la descripción de una canción en este formato:
    "[Título], interpretada por [artista], se lanzó en [año de lanzamiento]".
 */

fun main() {
    val brunoSong = Song("We Don't Talk About Bruno", "Encanto Cast", 2022, 1_000_000)
    brunoSong.printDescription()
    println(brunoSong.isPopular)
}

class Song(
    val title: String,
    val artist: String,
    val yearPublished: Int,
    val playCount: Int
){
    val isPopular: Boolean
        get() = playCount >= 1000

    fun printDescription() {
        println("$title, performed by $artist, was released in $yearPublished.")
    }
}