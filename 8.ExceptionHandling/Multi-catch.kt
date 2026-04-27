fun main() {
    val input = readLine() ?: "0"

    try {
        val num = input.toInt()
        val result = 100 / num
        println("Result: $result")
    } catch (e: NumberFormatException) {
        println("Number Format Exception: Please enter a valid integer.")
    } catch (e: ArithmeticException) {
        println("Arithmetic Exception: Cannot divide by zero.")
    }
}