data class Person3(val name: String, val age: Int)

fun main() {
    val man1 = Person3("manish", 18)
    val man2 = Person3("rahul", 18)
    val man3 = Person3("manish", 18)

    println("man1 hash: ${man1.hashCode()}")
    println("man2 hash: ${man2.hashCode()}")
    println("man3 hash: ${man3.hashCode()}")

    println("man1 == man2: ${man1 == man2}")
    println("man1 == man3: ${man1 == man3}")
}