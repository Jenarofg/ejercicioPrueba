package EjerciciosDAM

open class Bebida (val id: Int =0, val cantidad: Double = 0.0,var precio:Double =0.0, val marca: String="") {

    override  fun toString(): String {
        if (this.id != 0) {
            return "Id: $id, Cantidad: $cantidad,Precio: $precio,Marca: $marca"
        }else {
            return ""
        }
    }
}