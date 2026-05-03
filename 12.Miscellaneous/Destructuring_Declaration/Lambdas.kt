fun main() {
    val map = mapOf(
        1 to "Ishita", 2 to "Kamal", 3 to "Kanika",
        4 to "Minal", 5 to "Neha", 6 to "Pratyush",
        7 to "Shagun", 8 to "Shashank", 9 to "Uday", 10 to "Vandit"
    )

    println("Initial map is $map")

    // Destructuring a map entry into key and values
    val updatedMap = map.mapValues { (_, value) -> "Hello $value" }

    println("Map after appending Hello $updatedMap")
}