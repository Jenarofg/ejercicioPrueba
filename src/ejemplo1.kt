import org.jetbrains.annotations.Nullable

fun main() {

    condicionales(5)
}
fun variablesSinTip () {
    var num1 = 10
    var num2 = 5
    print("Suma: "+(num1+num2))
}


fun tiposVariables () {
    //Variables númericas.
    var  numeroFavorito: Int =1
    val numeroLong: Long = 45543534543
    var numeroFloat: Float = 1.98f
    var numeroDouble: Double = 3.45672
    //Variables de text0
    var numeroChar: Char = '1'
    numeroChar = '@'
    var cadena: String = "Hola Mundo"
    //Variables booleanas
    var valorVerdadero: Boolean = true
    //Anulacion de variables
    /*Con el interrogante le damos a esa variable
    la posibilidad de tener el valor null*/
    var nombre: String? = null

    numeroFloat = 2.99f
    println("Hola tengo " + numeroFavorito + " " + numeroLong + "Float: " +numeroFloat)
}


fun condicionales (numeroMes: Int) {

   when (numeroMes){
       1,2,3,4 -> println("Enero")
       in 5..8 -> println("Febrero")
       9,10,11,12 -> println("Marzo")
       !in 1..12 -> println("Numero mal introducido")
       }
   }
