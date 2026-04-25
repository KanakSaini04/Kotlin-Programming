fun main() {
    // Tests demonstrating entire string match
    val pattern = Regex("g([ee]+)ks?")
    println(pattern.matches("geeks"))
    println(pattern.matches("geeeeeeeeeeks"))
    println(pattern.matches("geeksforgeeks"))
}