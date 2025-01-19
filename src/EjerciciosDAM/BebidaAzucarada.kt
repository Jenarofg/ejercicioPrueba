package EjerciciosDAM

class BebidaAzucarada (id: Int,litros: Double,precio: Double,
                           marca:String,val porcentajeAzucar:Double, val promocion: Boolean)
        : Bebida(id,litros,precio,marca) {
    init {
        if (this.promocion){
            this.precio *= 0.9
        }
    }

    override fun toString(): String {
        if (super.toString() != ""){
            return super.toString() + ",Promocion = $promocion"
        }else{
            return ""
        }
    }
}