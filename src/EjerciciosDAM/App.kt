package EjerciciosDAM

import EjerciciosDAM.BebidaAzucarada

/*
    En un almacén se guardan un conjunto de bebidas.
Estas bebidas son: agua mineral y bebidas azucaradas
(coca-cola, fanta, etc). De las bebidas nos interesa
saber su identificador (único para cada bebida),
cantidad de litros, precio y marca.

Si es agua mineral nos interesa saber también el origen
(manantial, un sitio o de donde sea).

Si es una bebida azucarada queremos saber el porcentaje
que tiene de azúcar y si tiene o no alguna promoción
(si la tiene tendrá un descuento del 10% en el precio).

En el almacén se guardan estas bebidas por estanterías.
Tiene forma de matriz de tamaño máximo 5x5.

Las operaciones del almacén son las siguientes:

 -> Agregar bebida: agrega la bebida en la primera posición libre.
 -> Si el identificador está repetido en alguna de las bebidas,
    no se agregará.
 -> Eliminar bebida: dado un id, eliminar la bebida del almacén.
 -> Mostrar bebida: se muestra por pantalla la información de
    cada bebida.
 -> Calcular precio de todas las bebidas: calcula el precio total
    de todos los productos del almacén.
 -> Calcular el precio total de una marca de bebida: dada una
    marca, calcular el precio total de esas bebidas.
 -> Calcular el precio total de una columna de la estantería del
    almacén: dada una columna calcular el precio total de esas bebidas.
 -> Todos los métodos para 'Calcular el precio' se tienen que llamar
    igual y solo variar el número de parámetros que se reciben.
 */

private fun main(){
    var almacen = Almacen()
    var identificador = 0
    for (i in (0..9)){
        identificador = i + 1
        when(i%2){
            0 -> {
                val bebida = AguaMineral(identificador, 1.5, 2.75, "bezoya", "manantial");
                almacen.agregarBebida(bebida)
            }
            1 -> {
                val bebida = BebidaAzucarada(identificador, 0.33, 1.5, "Coca Cola", 10.0, true);
                almacen.agregarBebida(bebida)
            }
        }
    }
    almacen.mostrarInformacionBebidas()
    println("Precio de todas las bebidas: " + almacen.calcularPrecio())
    almacen.eliminarBebida(4)
    almacen.mostrarInformacionBebidas()
    println("Precio de todas las bebidas: " + almacen.calcularPrecio())
    println("Precio de todas las bebidas de la marca bezoya: " + almacen.calcularPrecio("bezoya"))
    println("Calcular el precio de la columna 0: " + almacen.calcularPrecio(0))
}