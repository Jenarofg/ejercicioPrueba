package EjerciciosDAM/*
Notificaciones móviles

Por lo general, el teléfono te proporciona un resumen de las notificaciones.

Escribe un programa que imprima el mensaje de resumen según la cantidad de notificaciones que recibiste.

El mensaje debe incluir lo siguiente:
La cantidad exacta de notificaciones cuando haya menos de 100
99+ como cantidad de notificaciones cuando haya 100 o más
La salida del programa debe ser:
 */

fun main() {
    println("Introduce el numero de notificaciones: ")
    val numNotificaciones = readln().toInt()
    enviarMensaje(numNotificaciones)
}

fun enviarMensaje(noti:Int){
    if (noti<100){
        println("Tienes $noti notificaciones")
    }else {
        println("¡Tu teléfono está explotando! Tienes 99+ notificaciones")
    }
}