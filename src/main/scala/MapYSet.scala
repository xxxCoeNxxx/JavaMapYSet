import scala.collection.immutable.List
import scala.collection.mutable.Map
import scala.collection.mutable.Set

object MapYSet {
    def main(args: Array[String]): Unit = {
        val personas = Map("Ana" -> 30, "Luis" -> 25, "Eva" -> 30, "Juan" -> 25)

    }
}






/* Ejercicio 1: Invertir un Mapa
Dado un Map[String, Int] que asocia nombres de personas con su edad, crea un nuevo mapa que asocie cada edad con un conjunto de nombres que la tienen.

Ejemplo de entrada:

val personas = Map("Ana" -> 30, "Luis" -> 25, "Eva" -> 30, "Juan" -> 25)
Salida esperada:

Map(30 -> Set("Ana", "Eva"), 25 -> Set("Luis", "Juan"))



Ejercicio 2: Intersección de claves y suma de valores
Dado dos mapas Map[String, Int], busca las claves comunes y suma sus valores, creando un nuevo mapa con esas sumas.

Ejemplo:

val m1 = Map("a" -> 1, "b" -> 2, "c" -> 3)
val m2 = Map("b" -> 5, "c" -> 7, "d" -> 10)
Salida esperada:

Map("b" -> 7, "c" -> 10)



Ejercicio 3: Palabras únicas en dos textos
Dadas dos listas de palabras (pueden tener repetidas), encuentra las palabras que aparecen en ambas listas pero solo una vez en cada una.

Ejemplo:

val texto1 = List("sol", "luna", "estrella", "sol", "mar")
val texto2 = List("mar", "sol", "luna", "luna", "cielo")
Salida esperada:

Set("mar")
(Solo "mar" aparece una vez en cada lista y está en ambas)




Ejercicio 4: Map de frecuencias y filtrado
Dada una lista de palabras, crea un mapa de frecuencias y luego filtra para quedarte solo con las palabras que aparecen más de una vez.

Ejemplo:

val palabras = List("a", "b", "a", "c", "b", "a", "d")
Salida esperada:

Map("a" -> 3, "b" -> 2)
(Solo las palabras con frecuencia mayor que 1) */