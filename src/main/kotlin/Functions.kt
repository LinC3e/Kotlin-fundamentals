fun hello(){
    return println("Hello, world!")
}
fun sum(x: Int, y: Int): Int {
    return x + y
}
fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun printMessageWithPrefixDefault(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun main() {
    hello()
    println(sum(1, 2))
    printMessageWithPrefix(prefix = "Log", message = "Hello")

    printMessageWithPrefixDefault("Hello", "Log")
    // [Log] Hello

    // Function called only with message parameter
    printMessageWithPrefixDefault("Hello")
    // [Info] Hello

    printMessageWithPrefixDefault(prefix = "Log", message = "Hello")
    // [Log] Hello
}