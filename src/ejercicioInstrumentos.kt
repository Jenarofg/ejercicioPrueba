fun main() {
    println("Objeto instrumento")
    var miInstrumento = InstrumentoMusical("Piano","Cuerda")
    miInstrumento.marca="Sony"
    miInstrumento.tocar()
    miInstrumento.limpiar()

    println("Objeto Guitarra")
    var miGuitarra = Guitarra ("Marron","JenaroGuitarra","Cuerda")
    miGuitarra.color = "Rojo"
    miGuitarra.afinar()

    println("Objeto Flaura")
    var miFlauta = Flauta("Pequeña","JenaFlaura","Aire")
    miFlauta.brillar()

    miFlauta.tocar()




}