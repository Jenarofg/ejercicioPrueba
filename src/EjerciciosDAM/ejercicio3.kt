package EjerciciosDAM

fun main() {
    conversorMedidas1()
    conversorMedidas2(300.00,"Kelvin","Celsius")
}


fun conversorMedidas1(){
    println("Introduce la cantidad a convertir: ")
    var medida: Double = readln().toDouble()
    println("Introduce la unidad de medida: ")
    var unidadMedida= readln().lowercase()
    println("Introduce a que unidad lo quieres convertir: ")
    var unidadAConvertir= readln().lowercase()

    var calcularValor: Double = 0.0

    if ((unidadMedida == "celsius") && (unidadAConvertir=="fahrenheit")){
        calcularValor = 9.0/5.0 * medida + 32
    }
    if ((unidadMedida == "kelvin") && (unidadAConvertir=="celsius")){
        calcularValor = medida - 273.15
    }
    if ((unidadMedida=="fahrenheit") && (unidadAConvertir=="kelvin")){
        calcularValor = 5.0/9.0 *(medida - 32) + 273.15
    }
    val medidaFinal = String.format("%.2f",calcularValor)
    println(medidaFinal)
}

fun conversorMedidas2(medidaInical: Double,escalaInicial:String,escalaFinal:String){
    val valorFinal = when (escalaInicial){
        "Celsius" ->  9.0/5.0 * medidaInical + 32
        "Kelvin" ->   medidaInical - 273.15
        "Fahrenheit" -> 5.0/9.0 *(medidaInical - 32) + 273.15
        else -> 999.99
    }
    val medidaFinal = String.format("%.2f",valorFinal)
    println("$medidaInical grados $escalaInicial son $medidaFinal grados $escalaFinal.")
}