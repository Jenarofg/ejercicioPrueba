fun main() {
    herencia()
}

private fun herencia (){

    val programador1 = Programador("Jenaro", 48,"Python")
    programador1.trabajar()
    programador1.imprimirLenguaje()
    val diseniador1 = Diseniador("Juan", 33)
    diseniador1.trabajar()
}

//Con open decimos que Persona va a ser la clase padre
open class Persona(nombre: String,edad: Int){
    open fun trabajar(){
        println("Esta persona esta trabajando")
    }
}

class Programador(val nombre: String,val edad:Int,val lenguaje: String): Persona(nombre,edad){
    override fun trabajar(){
        println("Esta persona está trabajando")
    }

    fun imprimirLenguaje(){
        println("Este trabajador esta programando en lenguaje $lenguaje")
    }
}

class Diseniador (val nombre:String, val edad:Int): Persona(nombre,edad){

    override fun trabajar() {
        println("Esta persona esta diseñando")
        super.trabajar()
    }
}