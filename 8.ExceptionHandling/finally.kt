fun main() {
    try {
        val result = 10 / 0
    } catch (e: ArithmeticException) {
        println(e)
    } finally {
        println("This block always executes")
    }
}