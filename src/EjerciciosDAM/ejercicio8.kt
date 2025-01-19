package EjerciciosDAM

fun main() {
    val carrera = listOf<String>("correr", "saltar", "correr", "saltar", "correr")
    val pista = "_|_|_"
    if (carreraDeObstaculos(carrera,pista)) println("Bien corrido")
}

fun carreraDeObstaculos (carrera: List<String>,pista:String): Boolean {

    var aux_pista = arrayListOf<Char>()
    var i = 0;
    for ((index, palabra) in carrera.withIndex()) {
        when (palabra) {

            "saltar" -> {
                if (pista[index] == '_') aux_pista.add('x')
            }

            "correr" -> {
                if (pista[index] == '|') aux_pista.add('/')
            }

            else -> aux_pista.add('?')
        }
    }
    for ((index,letra) in aux_pista.withIndex())
        if (letra === pista[index]){
                return true
        }else
            return false
    return false
}



