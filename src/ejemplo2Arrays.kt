import kotlin.math.sqrt

fun main() {
    val semana = arrayOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo")

    val semana2: ArrayList<String> = arrayListOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo")

    //Recorrer un array obteniendo el indice y el valor.
    for ((posicion,valor) in semana.withIndex()){
        println("En la posicion $posicion esta el valor $valor")
    }
    //Obtener los dias de la semana que empiezan por M
    val teclado=readln()
    val resultado = semana2.filter{
        var letra: String = teclado
        it.toLowerCase() == letra
    }
    println(resultado)
    var temperatura: Float? = 10.0f

    if (semana2.none()){
        println("Lista vacia")
    }

    print(temperatura)
}




