fun main() {
    var persona1 = Programmer("JEnaro",48,"Kotlin")
    var persona2 = Designer("Samuel", 22)

    persona1.work()
    persona1.sayLanguaje()
    persona2.work()
}

open class Person(name: String,age: Int):Work(){
    //Cualquier clase tiene una supercalse común "Any"

    open fun work(){
        println("Esta persona está trabajando")
    }

    override fun goToWork() {
        println("Esta persona va al trabajo")
    }
}

class Programmer(name: String,age: Int,val languaje:String): Person(name,age){

    override fun work() {
        //super.work()
        println("El programador esta trabajando")
    }

    fun sayLanguaje() {
        println("Este programador usa el lenguaje $languaje")
    }
}

class Designer(name: String,age: Int): Person(name,age){

}
//Clase abstracta no esta definiendo una implementacion solo un comportamiento.
abstract class Work {
    abstract fun goToWork()
}