fun main() {
    val fruits = listOf("apple", "banana", "orange", "grape")

    println("First fruit: ${fruits[0]}")
    println("Last fruit: ${fruits.last()}")
    for (fruit in fruits) {
        println(fruit)
    }
    val filtered = fruits.filter { it.startsWith("a") }
    println("Filtered list: $filtered")
}
// setup
