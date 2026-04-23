fun testA(a: Int, b: Int): Int {
    return try {
        a / b
    } catch (e: ArithmeticException) {
        println(e)
        println("Divide by zero not allowed")
        0
    }
}

fun main() {
    println(testA(10, 2))  
    println(testA(10, 0))  
}