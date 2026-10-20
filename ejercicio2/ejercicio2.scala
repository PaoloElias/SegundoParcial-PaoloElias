object ejercicio2{
    def main(args: Array[String]): Unit = {
        println(evaluar(50, validarPorcentaje(50)))
        println(evaluar(70, validarEdadLaboral(70)))
        println(evaluar(34, validarEdadLaboral(34)))
        println(evaluar(-10, validarNota(-10)))
    }

    def crearValidador(minimo: Int, maximo: Int, numero: Int): Int => Boolean = {
        if (numero >= minimo && numero <= maximo) {
            (x: Int) => true
        } else {
            (x: Int) => false
        }
    }
    val validarPorcentaje: Int => Int => Boolean = (numero: Int) => crearValidador(0, 100, numero)
    val validarEdadLaboral: Int => Int => Boolean = (numero: Int) => crearValidador(18, 65, numero)
    val validarNota: Int => Int => Boolean = (numero: Int) => crearValidador(0, 100, numero)


    def evaluar(numero: Int, validador: Int => Boolean): String = {
        if (validador(numero)) {
            "Valido"
        } else {
            "Invalido"
        }
    }


}