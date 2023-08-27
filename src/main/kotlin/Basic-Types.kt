fun main(args: Array<String>) {
    println("Basic Types")

    var customers = 10

    customers = 8

    customers = customers + 3 // Example of addition: 11
    customers += 7            // Example of addition: 18
    customers -= 3            // Example of subtraction: 15
    customers *= 2            // Example of multiplication: 30
    customers /= 3            // Example of division: 10

    println(customers) // 10

    /*
    *
Category      Basic types
Integers   -  Byte, Short, Int, Long
Unsigned  -   UByte, UShort, UInt, ULong
Floating-point numbers - Float, Double
Booleans  -   Boolean
Characters  - Char
Strings -     String
    * */
    println("---------------------")

    // Variable declarada sin inicializar
    val d:Int
    // Inicializando variable
    d = 3

    //Variable especificando tipo y inicializando
    val e:String = "Welcome"

    println(d) // 3
    println(e) // Welcome

    println("------------------")

    // Exercise
    // Declara el tipo correcto para cada variable
    val a:Int = 1000
    val b:String = "log message"
    val c:Double = 3.14
    val dd:Long = 100_000_000_000_000
    val ee:Boolean = false
    val f:Char = '\n'
}