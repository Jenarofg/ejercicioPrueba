/*
    La clase enum define una clase con palabras clave,
    que serviran como constantes
 */

enum class TipoCarta(val letra: Char) {
    DIAMANTE('D'),
    TREBOL('T'),
    CORAZON('C'),
    ESPADAS('E')
}
class Carta(val tipo:TipoCarta,val valor:Int){
    fun imprimir(){
        println("Carta: $tipo y su valor es: $valor")
    }
}

interface LimiteTarjeta{
    fun obtenerLimiteCredito():Int
}

enum class TipoTarjeta: LimiteTarjeta{
    PLATA {
        override fun obtenerLimiteCredito() = 10000
    },
    ORO {
        override fun obtenerLimiteCredito() = 20000
    }
}

fun main() {
    var diamantes = mutableListOf<Carta>()
    var treboles = mutableListOf<Carta>()

    for (i in 1..12) {
        diamantes.add(Carta(TipoCarta.DIAMANTE, i))
        treboles.add(Carta(TipoCarta.TREBOL, i))
    }

    for ((index,el) in diamantes.withIndex()) {
        diamantes[index].imprimir()
        treboles[index].imprimir()
    }

    for (TipCarta in TipoCarta.entries){
        println(TipCarta.letra)
    }

}