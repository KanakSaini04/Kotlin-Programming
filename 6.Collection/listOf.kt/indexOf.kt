fun main() {
    val numbers = listOf(1, 5, 7, 32, 0, 21, 1, 6, 10)

    println(numbers.get(0))
    println(numbers[7])
    println("First index of 1: ${numbers.indexOf(1)}")
    println("Last index of 1: ${numbers.lastIndexOf(1)}")
    println("Last index in list: ${numbers.lastIndex}")
}