class Flauta (tam:String,nombre:String,tipoInstrumento:String) : InstrumentoMusical(nombre,tipoInstrumento) {
    var tam:String = tam

    override fun tocar (){
        println("Estoy tocando la flauta")
    }


    fun brillar(){
        println("Se esta brillando la Flauta")
    }
}