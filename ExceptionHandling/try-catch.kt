fun main() {
    try {
        val num = 10 / 0
        println(num)
    } catch (e: ArithmeticException) {
        println("Divide by zero is not allowed")
    }
}