fun main() {
    var firstName: String? = "Praveen"
    var lastName: String? = null

    println(firstName?.toUpperCase()) // Prints "PRAVEEN"
    println(firstName?.length)       // Prints 7
    println(lastName?.toUpperCase()) // Prints null
}