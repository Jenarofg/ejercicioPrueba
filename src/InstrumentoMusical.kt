open class InstrumentoMusical (val nombre: String,val tipoInstrumento:String) {


    var marca: String = ""


    open fun tocar(){
        println("Esta tocando el instrumento de tipo $tipoInstrumento de nombre $nombre")
    }

    fun limpiar(){
        println("Esta limpiando el instrumento")
    }
}