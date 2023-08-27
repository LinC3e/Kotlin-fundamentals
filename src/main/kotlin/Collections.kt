fun main() {
    // Collections
    // List - Coleccion ordenada de items
    // Sets - Colecciones únicas de items desordenados
    // Maps - Conjuntos de pares clave-valor donde las claves son únicas y se asignan a un solo valor

    // LIST
    println("------------ List ---------------")
    // Para crear una lista de solo lectura usa - listOf()
    // Para crear una lista mutable usa - mutableListOF()
    val readOnlyShape = listOf("Triangle", "Circle", "Square")
    println(readOnlyShape) // [Triangle, Circle, Square]

    val shapes: MutableList<String> = mutableListOf("Triangle", "Square", "Circle")
    println(shapes)

    // Para prevenir modificaciones no deseadas, pueste obtener la lista solo lectura de una mutable lista
    // asignandola a una lista, esto se llama casting
    val shapesLocked: List<String> = shapes

    println("The first item in the list is: ${readOnlyShape[0]}")
    // para obtener el primer como el ultimo item, usa la funcion first(), last()
    println("The first item in the list is: ${readOnlyShape.last()}")

    // para obtener el numero de items, usa la funcion count()
    println("La lista tiene ${readOnlyShape.count()}")

    // para chequear si un item esta en la lista usa el operador in
    println("Circle" in readOnlyShape)

    // para agregar o remover un item de una lista mutable, usa las funciones add() y remove()
    shapes.add("Pentagon")
    println(shapes)

    shapes.remove("Pentagon")
    println(shapes)

    // SET
    println("------------ SET ---------------")
    // Mientras que list permite items duplicados y ordenados, set solo peromite items unicos y desordenados

    // Para crear set de solo lectura, usa la funcion setOf()
    // Para crear set mutables, usa la funcion mutableSetOf()

    val readOnlyFruit = setOf("apple", "banana", "orange")
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")

    println(readOnlyFruit)
    println(fruit)

    // como los set son desordenados, no puedes acceder a un index en particular del set

    // para obtener el numero de items, usa la funcion count()
    println("Hay un total de ${fruit.count()} items en el set")

    // para chequear si un item esta en set usa el operador in
    println("apple" in fruit)

    // para agregar o remover un item de un set mutable, usa las funciones add() y remove()
    fruit.add("watermelon")
    println(fruit)

    fruit.remove("watermelon")
    println(fruit)


    // MAP
    println("------------ MAP ---------------")
    // Maps almacena items como pares key-values

    // Cada key en el map tiene que ser unica
    // puedes tener duplicados los valores in un mapa

    // Para crear un map de solo lectura usa la funcion, mapOf()
    // para crear un map mutable, usa la funcion mutableMapOf()

    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 150)
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 150)

    println(readOnlyJuiceMenu)
    println(juiceMenu)

    // Para prevenir modificaciones no deseadas, obtiene la vista del map de solo lectura castenadolo
    val juiceMenuLocked: Map<String, Int> = juiceMenu

    // para acceder al valor en el map usa el operador [] con la clave que deseas bucar
    println("El valor del jugo de manzana es ${readOnlyJuiceMenu["apple"]}")

    // para obtener el numero de items del map, usa la funcion count()
    println("El mapa tiene ${readOnlyJuiceMenu.count()} items")

    // para agregar o eliminar item de un map mutable, usa la funcion put() y remove()
    juiceMenu.put("coconut", 150) // Add key "coconut" with value 150 to the map
    println(juiceMenu)

    juiceMenu.remove("orange")
    println(juiceMenu)

    // para checkear si un item pertenece al map, usa la funcion containsKey()
    println(readOnlyJuiceMenu.containsKey("apple"))
}

