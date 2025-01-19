fun main() {
    carrera()
}

fun carrera (){
    val aux = charArrayOf(' ',' ',' ',' ',' ')
    val carrera= arrayOf("correr", "correr", "correr", "saltar", "correr")
    val pista=charArrayOf('_','|','_','|','_')

    for ((index,turno) in carrera.withIndex() ){

            when (pista[index]){
               '_'-> {
                   if (carrera[index]=="saltar") aux[index]='x' else aux[index]='_'
               }
                '|'-> {
                    if (carrera[index]=="correr") aux[index]='/' else aux[index]='|'
                }
            }
    }
    println(aux)
    println(pista)
    if (aux.contentEquals(pista)) {
        println("Bien corrido")
    }else {
        println ("Intentalo otra vez")
    }
}


