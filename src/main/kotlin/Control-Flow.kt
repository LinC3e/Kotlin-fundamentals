fun main(){
    println("------- Expresiones condicionales --------")
    // Kotlin ofrece if y when para cheackear expresiones de condicion

    // IF
    val d: Int
    val check = true

    if (check) {
        d = 1
    } else {
        d = 2
    }

    println(d)

    // En kotlin no hay operador ternario - condition ? then : else.
    // If se puede usar como expresion, Cuando usas if como expresion, no usas llaves
    val a = 1
    val b = 2

    println(if (a > b) a else b) // Returns a value: 2

    println("--------------")
    // WHEN
    //Utilícelo cuando tenga una expresión condicional con varias ramas,
    //cuando se puede utilizar como una declaración o como una expresión.
    val obj = "Hello"

    when (obj) {
        // Checks whether obj equals to "1"
        "1" -> println("One")
        // Checks whether obj equals to "Hello"
        "Hello" -> println("Greeting")
        // Default statement
        else -> println("Unknown")
    }  // Greeting

    // Aqui un ejemplo usando when como una expresion, la sintaxis when es asignado inmediatamente a la variable
    val temp = 18

    val description = when {
        // If temp < 0 is true, sets description to "very cold"
        temp < 0 -> "very cold"
        // If temp < 10 is true, sets description to "a bit cold"
        temp < 10 -> "a bit cold"
        // If temp < 20 is true, sets description to "warm"
        temp < 20 -> "warm"
        // Sets description to "hot" if no previous condition is satisfied
        else -> "hot"
    }
    println(description) // warm

    println("------ Rangos -------")
    // Antes de ver loops , es necesario saber como se constuyen los rangos para iterar loops

    // Las mas comun en Kotlin es usar el operador ..
    // Ej : 1..4    equivale a 1,2,3,4

    // Para declarar un rango que no incluye el ultimo valor, usa ..<
    // Ej : 1..<4   equivale a 1,2,3

    // Para declarar un rango en orden inverso, usa downTo
    // EJ : 4 downTo 1  equivale a 4,3,2,1

    // Para declarar un rango que incrementa en un paso que no es 1, usa step mas el incremento deseado
    // EJ: 1..5 step 2  equiva;e a 1,3,5

    // Puedes hacer lo mismo con char 'a'..'d' is equivalent to 'a', 'b', 'c', 'd'
    println("------ Loops ------")
    // Se utiliza for iterar sobre un rango de valores y realizar una acción.
    // Úsa while para continuar una acción hasta que se cumpla una condición particular.

    // FOR
    for (number in 1..5) {
        // number is the iterator and 1..5 is the range
        println(number)
    }  // 12345

    // Listas tambien pueden ser iteradas
    val cakes = listOf("carrot", "cheese", "chocolate")

    for (cake in cakes) {
        println("Yummy, it's a $cake cake!")
    }
// Yummy, it's a carrot cake!
// Yummy, it's a cheese cake!
// Yummy, it's a chocolate cake!


    // WHILE
    var cakesEaten = 0
    while (cakesEaten < 3) {
        println("Eat a cake")
        cakesEaten++
    }
// Eat a cake
// Eat a cake
// Eat a cake
    println("Do while ---------")
    // Do while
    var cakeEaten = 0
    var cakeBaked = 0
    while (cakeEaten < 3) {
        println("Eat a cake")
        cakeEaten++
    }
    do {
        println("Bake a cake")
        cakeBaked++
    } while (cakeBaked < cakeEaten)
}
