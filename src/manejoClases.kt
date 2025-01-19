fun main() {
 clases()
}

private fun clases() {
    val contacto1 = Contacto()
    contacto1.categoria= "20"
    println("${contacto1.id} - ${contacto1.email} - ${contacto1.categoria}")
}

/* Las propiedades que van entre parentesis son propiedades que se
definen cuando construimos un objeeto son obligatorios -> id y email en
este caso, si queremos añadir mas propiedades no obligatorias las añadimos
en el cuerpo de la clase, esta propiedad tiene que estar inicializada
obligatoriamente cosa que no pasa en las propiedades obligatorias donde
tenemos la opcion de inicializarlas o no.
 */
class Contacto(val id: Int=1, val email: String="sin email"){
    var categoria: String ="10"
        get(){
            return "Categoria: " + this.id
        }
        set(value) {
            field = value
        }
}
