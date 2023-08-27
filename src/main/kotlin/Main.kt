import java.util.IntSummaryStatistics

fun main(args: Array<String>) {
    println("Kotlin fundamentals")
    println("-------------------------------")

    // Variables
    // read-only variables with - val
    // mutable variables with - var
    val popcorn = 5
    val hotdog = 7
    var customer = 10

    customer = 6
    println(customer)

    println("-------------------------------")
    // String Templates
    println("Hay un total de $hotdog hotdogs")
    println("Hay un total de ${popcorn + 1} popcorns")

    println("-------------------------------")
    // Exercise 1
    val name:String = "Mary"
    val age:Int = 21

    println("$name is $age years old.")



    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}