data class Person(val name: String, val age: Int)

fun getPersonDetails(): Person {
    return Person("Jack", 30)
}

fun main() {
    val (name, age) = getPersonDetails()
    println("Name is $name Age is $age")
}