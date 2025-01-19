fun main() {

    val cadena="{ [ a * ( c + d ) ] - 5 } ¿está balanceada?"


    if (expresionbalanceada(cadena)){
        println("Es una expresion balanceada")
    }else{
        println("No es una expresion balanceda")
    }

}

fun expresionbalanceada (expresion: String): Boolean{

    val mapa = mapOf("(" to ")","[" to "]","{" to "}","¿" to "?" )
    val pila = arrayListOf<String>()

    expresion.forEach {
        val simbolo = it.toString()
        val contieneClave: Boolean = mapa.containsKey(simbolo)

        if (contieneClave || mapa.containsValue(simbolo) ){
            if (contieneClave){
                pila.add(simbolo)
            }else if (pila.isEmpty() || simbolo != mapa[pila.removeLast()])
                return false
        }
    }
    return pila.isEmpty
}