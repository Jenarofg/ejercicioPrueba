package EjerciciosDAM

import EjerciciosDAM.BebidaAzucarada

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