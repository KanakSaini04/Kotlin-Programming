class Add(val a: Int, val b: Int) {
    val c = a + b
}

fun main() {
    val add = Add(5, 6)
    println("The Sum of two numbers is: ${add.c}")
}