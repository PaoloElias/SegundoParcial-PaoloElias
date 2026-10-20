object ejercicio3 {
    def main(args: Array[String]): Unit = {
        val desde = 1
        val hasta = 7

        println(contarDivisoresRecursivo(hasta))
        println(primoMasBajo(desde, hasta))
    }

    def procesarRango(desde: Int, hasta: Int, transformar: Int => Int, combinar: (Int, Int) => Int, valorInicial: Int): Int = {
        if (desde > hasta) {
            valorInicial
        } else {
            val valorTransformado = transformar(desde)
            val valorCombinado = combinar(valorTransformado, valorInicial)
            procesarRango(desde + 1, hasta, transformar, combinar, valorCombinado)
        }
    }

    def buscar(desde: Int, hasta: Int, condicion: Int => Boolean): Int = {
        if (desde > hasta) {
            -1
        } else if (condicion(desde)) {
            desde
        } else {
            buscar(desde + 1, hasta, condicion)
        }
    }
 
    
    def contarDivisoresRecursivo(hasta: Int): Int = {
        def contarDivisores(n: Int, divisor: Int): Int = {
            if (divisor > n) 0
            else if (n % divisor == 0) 1 + contarDivisores(n, divisor + 1)
            else contarDivisores(n, divisor + 1)
        }
        contarDivisores(hasta, 1)
    }


    def primoMasBajo(desde: Int, hasta: Int): Int = {
        def esPrimo(n: Int): Boolean = {
            if (n < 2) false
            else !(2 to Math.sqrt(n).toInt).exists(n % _ == 0)
        }
        buscar(desde, hasta, esPrimo)
    }
}