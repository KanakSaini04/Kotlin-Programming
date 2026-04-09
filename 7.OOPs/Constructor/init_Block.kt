class Person(val name: String) {
    init { println("This is first init block") }
    init { println("This is second init block") }
    init { println("This is third init block") }
}

fun main() {
    val person = Person("Geeks")
    println("Name = ${person.name}")
}