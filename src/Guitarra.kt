class Guitarra {
    var color:String=""

    constructor(color:String,nombre:String,tipoInstrumento:String){
        this.color=color
    }

    fun afinar(){
        println("Se esta afinando la guitarra de color $color")
    }
}