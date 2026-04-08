class Person {
    var age: Int = 0
        set(value) {
            if (value > 0) field = value
            else println("Age must be positive")
        }
}

fun main() {
    val p = Person()
    p.age = -5
    p.age = 30
    println(p.age)
}