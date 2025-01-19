package EjerciciosDAM
/*
    Crea la clase ‘EjerciciosDAM.Cuenta’ con los siguientes atributos:

    Titular: obligatorio.
    Cantidad: opcional.
    Crea dos constructores que cumplan lo anterior.

    Tendrá dos métodos:
    Ingresar: se ingresa una cantidad a la cuenta.
    i la cantidad introducida es negativa, no se hará nada.
    Retirar: se retira una cantidad de la cuenta.
    Si la cantidad después de la retirada de efectivo es negativa,
    la cantidad de la cuenta pasa a ser 0.
 */

fun main() {
    println("Introduce la cantidad: ")
    var valor = readln().toDouble()
    var cuenta1 = Cuenta("Jenaro")

    cuenta1.retirar(valor)
}

data class Cuenta (val titular: String, var cantidad: Double){

    constructor(tit:String) : this(tit,0.0)

    fun ingresar ( cantidad: Double) {
        if (cantidad > 0) {
            this.cantidad += cantidad
        }
    }

    fun retirar ( cantidad: Double){
        var saldo= this.cantidad - cantidad
        if (saldo < 0)
            saldo = 0.0
        this.cantidad = saldo
    }
}