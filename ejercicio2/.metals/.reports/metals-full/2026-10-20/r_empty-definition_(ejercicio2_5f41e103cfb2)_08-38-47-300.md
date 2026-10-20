error id: file:///C:/Users/p1406/OneDrive/Escritorio/SegundoParcialPrograFuncional/ejercicio2/ejercicio2.scala:
file:///C:/Users/p1406/OneDrive/Escritorio/SegundoParcialPrograFuncional/ejercicio2/ejercicio2.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -valor.
	 -valor#
	 -valor().
	 -scala/Predef.valor.
	 -scala/Predef.valor#
	 -scala/Predef.valor().
offset: 711
uri: file:///C:/Users/p1406/OneDrive/Escritorio/SegundoParcialPrograFuncional/ejercicio2/ejercicio2.scala
text:
```scala
object ejercicio2{
    def main(args: Array[String]): Unit = {
        println(evaluar(50, validarPorcentaje))
        println(evaluar(70, validarEdadLaboral))
        println(evaluar(34, validarEdadLaboral))
        println(evaluar(-10, validarNota))
    }

    def crearValidador(minimo: Int, maximo: Int, numero: Int): Int => Boolean = {
        if (numero >= minimo && numero <= maximo) {
            (x: Int) => true
        } else {
            (x: Int) => false
        }
    }

    val validarPorcentaje: Int => Boolean = crearValidador(0, 100, 50)
    val validarEdadLaboral: Int => Boolean = crearValidador(18, 65, 34)
    val validarNota: Int => Boolean = crearValidador(0, 100, val@@or)

    def evaluar(numero: Int, validador: Int => Boolean): String = {
        valor = numero
        if (validador(numero)) {
            "Valido"
        } else {
            "Invalido"
        }
    }


}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 