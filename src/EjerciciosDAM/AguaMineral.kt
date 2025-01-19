package EjerciciosDAM

class AguaMineral (id: Int, cantidad: Double, precio: Double, marca: String, val origen:String) : Bebida(id,cantidad,precio,marca) {
    override  fun toString(): String {
        if (super.toString() != ""){
            return super.toString() + ", Origen = $origen"
        }else {
            return ""
        }
    }
}
