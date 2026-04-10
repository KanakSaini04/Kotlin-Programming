// public by default
class A {
    val int1 = 10
    fun display() {
        println("Value: $int1")
    }
}

fun main() {
    val obj = A()
    obj.display()   // Accessible from anywhere
}