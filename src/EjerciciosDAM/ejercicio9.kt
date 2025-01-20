
import kotlin.math.absoluteValue

/*
    Escribe un programa que llame a una función que analice una matriz 3x3 compuesta por "X" y "O" y retorne lo siguiente:
    "X" si han ganado las "X"
    "O" si han ganado los "O"
    "Empate" si ha habido un empate
    "Nulo" si la proporción de "X", de "O", o de la matriz no es correcta. O si han ganado los 2.
    Nota: La matriz puede no estar totalmente cubierta. Se podría representar con un vacío "", por ejemplo.

    Probar con las siguientes expresiones:
    [["X", "O", "X"], ["O", "X", "O"], ["O", "O", "X"]]
    [["", "O", "X"], ["", "X", "O"], ["", "O", "X"]]
    [["O", "O", "O"], ["O", "X", "X"], ["O", "X", "X"]]
    [["X", "O", "X"], ["X", "X", "O"], ["X", "X", "X"]]
 */
fun main() {
    ejercicio9()
}

private fun ejercicio9() {
    println(analizarMatriz(arrayOf(
        arrayOf(ValoresMatriz.X, ValoresMatriz.O, ValoresMatriz.X),
        arrayOf(ValoresMatriz.O, ValoresMatriz.X, ValoresMatriz.O),
        arrayOf(ValoresMatriz.O, ValoresMatriz.O, ValoresMatriz.X))))

    println(analizarMatriz(arrayOf(
        arrayOf(ValoresMatriz.VACIO, ValoresMatriz.O, ValoresMatriz.X),
        arrayOf(ValoresMatriz.VACIO, ValoresMatriz.X, ValoresMatriz.O),
        arrayOf(ValoresMatriz.VACIO, ValoresMatriz.O, ValoresMatriz.X))))

    println(analizarMatriz(arrayOf(
        arrayOf(ValoresMatriz.O, ValoresMatriz.O, ValoresMatriz.O),
        arrayOf(ValoresMatriz.O, ValoresMatriz.X, ValoresMatriz.X),
        arrayOf(ValoresMatriz.O, ValoresMatriz.X, ValoresMatriz.X))))

    println(analizarMatriz(arrayOf(
        arrayOf(ValoresMatriz.X, ValoresMatriz.O, ValoresMatriz.X),
        arrayOf(ValoresMatriz.X, ValoresMatriz.X, ValoresMatriz.O),
        arrayOf(ValoresMatriz.X, ValoresMatriz.X, ValoresMatriz.X))))
}

private enum class ValoresMatriz {
    X, O, VACIO
}

private enum class ResultadoMatriz {
    X, O, EMPATE, NULL
}

private fun analizarMatriz(tablero: Array<Array<ValoresMatriz>>): ResultadoMatriz {
    // Null
    if (tablero.count() != 3) {
        return ResultadoMatriz.NULL
    }

    var numX = 0
    var numO = 0

    var matriz: Array<ValoresMatriz> = emptyArray()
    for (fila in tablero) {
        matriz += fila
        if (fila.count() != 3) {
            return ResultadoMatriz.NULL
        }
        for (columna in fila) {
            if (columna == ValoresMatriz.X) {
                numX += 1
            } else if (columna == ValoresMatriz.O) {
                numO += 1
            }
        }
    }

    if ((numX - numO).absoluteValue > 1) {
        return ResultadoMatriz.NULL
    }

    // Ganar o empatar
    val combinacionesGanador = arrayOf(
        arrayOf(0, 1, 2), arrayOf(3, 4, 5), arrayOf(6, 7, 8), arrayOf(0, 3, 6),
        arrayOf(1, 4, 7), arrayOf(2, 5, 8), arrayOf(0, 4, 8), arrayOf(2, 4, 6))

    var resultado = ResultadoMatriz.EMPATE

    for (combinacionGanadora in combinacionesGanador) {
        if (matriz[combinacionGanadora[0]] != ValoresMatriz.VACIO
            && matriz[combinacionGanadora[0]] == matriz[combinacionGanadora[1]]
            && matriz[combinacionGanadora[0]] == matriz[combinacionGanadora[2]]) {

            val ganador = matriz[combinacionGanadora[0]]

            if (resultado != ResultadoMatriz.EMPATE
                && (if (resultado == ResultadoMatriz.O) ValoresMatriz.O else ValoresMatriz.X) != ganador) {
                return ResultadoMatriz.NULL
            }

            resultado = if (ganador == ValoresMatriz.X) ResultadoMatriz.X else ResultadoMatriz.O
        }
    }

    return resultado
}