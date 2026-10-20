object ejercicio1 {
    def main(args: Array[String]): Unit = {
    }

    def crearTransformacion(factor: Double, desplazamiento: Double): Double => Double = {
        (x: Double) => factor * x + desplazamiento
    }

    
    val corregirError: Double => Double = crearTransformacion(1, 1 - 1.5)
    val calibrarSensor: Double => Double = crearTransformacion(1 * 1.04, 1)
    val convertirFarenheit: Double => Double = crearTransformacion(1 * 1.8, 1 + 32.0) 

    val procesarTemperatura: Double => Double = corregirError andThen calibrarSensor andThen convertirFarenheit

    //No sabia que valores iniciales habiaque ponerle xd
    println(procesarTemperatura(20))
    println(procesarTemperatura(30))
    println(procesarTemperatura(10))

}