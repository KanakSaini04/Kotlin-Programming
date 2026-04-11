data class Person2(val name: String, val age: Int) {
    var height: Int = 100
}

fun main() {
    val man1 = Person2("manish", 18)
    man1.height = 100

    val man2 = man1.copy(name = "rahul")
    man2.height = 90

    val man3 = man1.copy()
    man3.height = 110

    println("${man1.name}, ${man1.age} has ${man1.height} cm height")
    println("${man2.name}, ${man2.age} has ${man2.height} cm height")
    println("${man3.name}, ${man3.age} has ${man3.height} cm height")
}