package EjerciciosDAM

/*
En un almacén se guardan un conjunto de bebidas.

Estas bebidas son: agua mineral y bebidas azucaradas (coca-cola, fanta, etc).
De las bebidas nos interesa saber su identificador (único para cada bebida),
cantidad de litros, precio y marca.

Si es agua mineral nos interesa saber también el origen
(manantial, un sitio o de donde sea).

Si es una bebida azucarada queremos saber el porcentaje que tiene de azúcar
y si tiene o no alguna promoción (si la tiene tendrá un descuento del 10%
en el precio).

En el almacén se guardan estas bebidas por estanterías. Tiene forma de matriz
de tamaño máximo 5x5.

Las operaciones del almacén son las siguientes:

Agregar bebida: agrega la bebida en la primera posición libre.
Si el identificador está repetido en alguna de las bebidas, no se agregará.
Eliminar bebida: dado un id, eliminar la bebida del almacén.
Mostrar bebida: se muestra por pantalla la información de cada bebida.
Calcular precio de todas las bebidas: calcula el precio total de todos los
productos del almacén.
Calcular el precio total de una marca de bebida: dada una marca, calcular el
precio total de esas bebidas.
Calcular el precio total de una columna de la estantería del almacén: dada
una columna calcular el precio total de esas bebidas.
Todos los métodos para 'Calcular el precio' se tienen que llamar igual y sólo
variar el número de parámetros que se reciben.
 */

class Almacen(var estanteria: ArrayList<ArrayList<Bebida>> = arrayListOf<ArrayList<Bebida>>()) {

    init {
        if (this.estanteria.none()){
            for (fila in (0..4)){
                val columna: ArrayList<Bebida> = arrayListOf<Bebida>()
                this.estanteria.add(columna)
            }
        }
    }

    fun agregarBebida(bebida: Bebida) {
        var encontrado = false
        var i = 0
        while (i < this.estanteria.size && !encontrado) {
            var j = 0
            while (j < 5 && !encontrado) {
                if (this.estanteria.get(i).size < 5){
                    if (this.estanteria.get(i).size == 0 || !this.bebidaRepetida(bebida)){
                        this.estanteria.get(i).add(bebida)
                        encontrado = true
                    }
                }
                j++
            }
            i++
        }

        if (encontrado) {
            println("EjerciciosDAM.Bebida añadida")
        } else {
            println("No se ha podido añadir la bebida")
        }
    }



    private fun bebidaRepetida(bebida: Bebida): Boolean{

        var repetida = false
        for (i in (0..this.estanteria.size - 1)){
            for (j in (0..this.estanteria.get(i).size - 1)){
                if (this.estanteria.get(i).get(j) == bebida){
                    repetida = true
                    break
                }
            }

            if (repetida){
                break
            }
        }
        return repetida
    }

    fun eliminarBebida(id: Int){
        var encontrada = false
        for (fila in (0..this.estanteria.size - 1)){
            var identificadores = this.estanteria.get(fila).filter { it.id == id }
            if (!identificadores.none() && identificadores.size == 1){
                this.estanteria.get(fila).remove(identificadores.elementAt(0))
                encontrada = true
            }
        }

        if (encontrada){
            println("EjerciciosDAM.Bebida eliminada")
        } else {
            println("No existe la bebida")
        }
    }

    fun mostrarInformacionBebidas(){
        if (this.estanteria.none()){
            println("La estantería está vacía")
        } else{
            for (i in (0 .. this.estanteria.size - 1)){
                for (j in (0 .. this.estanteria.get(i).size - 1)){
                    println(this.estanteria.get(i).get(j).toString())
                }
            }
        }
    }

    fun calcularPrecio(): Double{
        var precioTotal: Double = 0.0
        for (i in (0 .. this.estanteria.size - 1)){
            for (j in (0 .. this.estanteria.get(i).size - 1)){
                precioTotal += this.estanteria.get(i).get(j).precio
            }
        }
        return precioTotal
    }

    fun calcularPrecio(marca: String): Double{
        var bebidasTotal:ArrayList<Bebida> = arrayListOf<Bebida>()
        for (fila in (0..4)) {
            var listaBebidas = this.estanteria.get(fila).filter { it.marca.trim().lowercase() == marca.trim().lowercase() }
            bebidasTotal.addAll(listaBebidas)
        }
        return this.calcularPrecioListaBebidas(bebidasTotal)
    }

    private fun calcularPrecioListaBebidas(lista:ArrayList<Bebida>): Double{
        var precioTotal: Double = 0.0
        lista.forEach {
            precioTotal += it.precio
        }
        return precioTotal
    }

    fun calcularPrecio(columna: Int): Double{
        var precioTotal: Double = 0.0
        if (columna in (0..4)){
            for (fila in (0..this.estanteria.size - 1)) {
                if (!this.estanteria.get(fila).none()){
                    precioTotal += this.estanteria.get(fila).get(columna).precio;
                }
            }
        } else {
            println("La columna debe estar entre 0 y 4")
        }
        return precioTotal
    }
}

