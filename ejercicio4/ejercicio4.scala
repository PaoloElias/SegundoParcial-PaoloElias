//sistema de gestion para eventos

    abstract class Evento(val nombre: String, val fecha: String, val lugar: String) {
        def mostrarDetalles(): Unit
        def empezarEvento(): Unit = {
            println(s"El evento $nombre ha comenzado en $lugar el $fecha.")
        }
    }


    class catering(val menu: String) extends Evento("Catering", "2023-10-15", "Hotel XYZ") {
        override def mostrarDetalles(): Unit = {
        println(s"Evento: $nombre")
        println(s"Fecha: $fecha")
        println(s"Lugar: $lugar")
        println(s"Menú: $menu")
        }

        def servirComida(): Unit = {
            println(s"Sirviendo el menú: $menu")
        }
    }


    class conferencia(val tema: String) extends Evento("Conferencia", "2023-11-20", "Centro de Convenciones ABC") {
        override def mostrarDetalles(): Unit = {
        println(s"Evento: $nombre")
        println(s"Fecha: $fecha")
        println(s"Lugar: $lugar")
        println(s"Tema: $tema")
        }

        def iniciarConferencia(): Unit = {
            println(s"Iniciando la conferencia sobre: $tema")
        }
    }


    trait GestionEventos {
        def agregarEvento(evento: Evento): Unit
        def mostrarEventos(): Unit
    }