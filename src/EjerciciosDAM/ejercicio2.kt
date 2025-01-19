package EjerciciosDAM/*
Precio de la entrada de cine

Las entradas de cine suelen tener un precio diferente según la edad de los espectadores.

Escribe un programa que calcule los precios de estas entradas basados en la edad:

* Un precio de entrada infantil de 5,4€ para personas de 12 años o menos.
* Un precio de entrada estándar de 8,5€ para personas de entre 13 y 60 años.
  Los lunes, un precio estándar con descuento de 6,7€ para el mismo grupo de edad.
* Un precio para adultos mayores de 5€ para personas de 61 años o más
  (asumimos que la edad máxima de un espectador es de 100 años)
* Un valor de -1 para indicar que el precio no es válido cuando un usuario ingresa
  una edad fuera de las especificaciones.
 */

fun main() {
    println("Introduce la edad")
    var edad=readln().toInt()
    if (edad>12 && edad<61){
        println("Introduce el dia de la semana: ")
        var dia=readln().uppercase()
        calcularPrecioEntrada(edad,diaSemana.valueOf(dia))
    }else  calcularPrecioEntrada(edad,null)
}

enum class diaSemana(val letra: Char) {
    LUNES('L'),
    MARTES('M'),
    MIERCOLES('X'),
    JUEVES('J'),
    VIERNES('V'),
    SABADO('S'),
    DOMINGO('D')
}

fun calcularPrecioEntrada(edad:Int,dia: diaSemana?){
    when (edad){
        in 0..12 -> println("El precio de la entrada para una persona de $edad es 5,4€")
        in 13..60 -> {
            if (diaSemana.LUNES==dia){
                println("El precio de la entrada para una persona de $edad el $dia es 6,7€")
            }else{
                println("El precio de la entrada para una persona de $edad el $dia es 8,5€")
            }
        }
        in 61..100 -> println("El precio de la entrada para una persona de $edad es 5€")
        else -> println("Error al introducir la edad")
    }
}