import Alumnos

fun main() {
    println("Introduce la cantidad de alumnos: ")
    var numAlumnos = readln().toInt()
    var listaAlumnos = Array<Alumnos?>(numAlumnos){null}

    for (i in 0 until numAlumnos) {
        println("Introduce el nombre del alumno: ")
        var nombreAlumno = readln()
        println("Introduce el aula: ")
        var aula = readln()[0]
        println("Introduce la calificacion: ")
        var calificacion = readln().toDouble()

        listaAlumnos[i] = Alumnos(nombreAlumno, aula)
        listaAlumnos[i]!!.calificacion = calificacion
    }

    var suma: Double = 0.0
    var promedio = 0.0
    var cantAlumnosPorSalon=0

    println("Introduce la clase de los alumnos a promediar ")
    var clasePromedio = readln()

}
