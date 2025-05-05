import scala.collection.immutable.List
import scala.collection.mutable.Map
import scala.collection.mutable.Set

object MapYSet {
    def main(args: Array[String]): Unit = {
        ejercicio1()
        ejercicio2()
        ejercicio3()
    }

    private def ejercicio1(): Unit = {
        println("-------------------------------------------")
        println("Ejercicio 1: Invertir un Mapa")
        val personas = Map("Ana" -> 30, "Luis" -> 25, "Eva" -> 30, "Juan" -> 25)

        val personasInvertido: Map[Int, Set[String]] = Map()
        personas.foreach { case (nombre, edad) =>
            if (personasInvertido.contains(edad)) {
                personasInvertido(edad) += nombre
            } else {
                personasInvertido(edad) = Set(nombre)
            }
        }
        println(personasInvertido)
        println()

/*      val resultado: Map[Int, Set[String]] = Map()
        personas.foreach { par => 
            val nombre = par._1
            val edad = par._2  
            if (resultado.contains(edad)) {
                resultado(edad) += nombre
            } else {
                resultado(edad) = Set(nombre)
            }
        } */
    }

    private def ejercicio2(): Unit = {
        println("-------------------------------------------")
        println("Ejercicio 2: Intersección de claves y suma de valores")
        // Salida: Map("b" -> 7, "c" -> 10)
        val m1 = Map("a" -> 1, "b" -> 2, "c" -> 3)
        val m2 = Map("b" -> 5, "c" -> 7, "d" -> 10)

        val resultado = Map[String, Int]()

        m1.foreach { case (letra, valor1) =>
            if (m2.contains(letra))  {
                val valor2 = m2(letra)
                resultado(letra) = valor1 + valor2 
            }
        }
        println(resultado.toMap) // toMap convierte el resultado a un Map inmutable
        println()
    }

    /* Ejercicio 3: Palabras únicas en dos textos
    Dadas dos listas de palabras (pueden tener repetidas), encuentra las palabras que aparecen en ambas listas 
    pero solo una vez en cada una. */
    private def ejercicio3(): Unit = {
        println("-------------------------------------------")
        println("Ejercicio 3: Palabras únicas en dos textos")
        val texto1 = List("sol", "luna", "estrella", "sol", "mar")
        val texto2 = List("mar", "sol", "luna", "luna", "cielo")

                
    }
}



    

/*
Ejercicio 3: Palabras únicas en dos textos
Dadas dos listas de palabras (pueden tener repetidas), encuentra las palabras que aparecen en ambas listas pero solo una vez 
en cada una.

Ejemplo:

val texto1 = List("sol", "luna", "estrella", "sol", "mar")
val texto2 = List("mar", "sol", "luna", "luna", "cielo")
Salida esperada:

Set("mar")
(Solo "mar" aparece una vez en cada lista y está en ambas)




Ejercicio 4: Map de frecuencias y filtrado
Dada una lista de palabras, crea un mapa de frecuencias y luego filtra para quedarte solo con las palabras que aparecen más 
de una vez.

Ejemplo:

val palabras = List("a", "b", "a", "c", "b", "a", "d")
Salida esperada:

Map("a" -> 3, "b" -> 2)
(Solo las palabras con frecuencia mayor que 1) */