class Person(val name: String)

fun main() {
    // Constructor Reference
    val constructorRef = ::Person
    val person = constructorRef("Alice")
    println(person.name)
}