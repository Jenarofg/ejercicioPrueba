fun main() {

   var cadena ="je3naro"

    for (i in cadena.length-1 downTo 0){
        if (cadena[i].toChar().isLetter())
            print(cadena[i])
    }
}

