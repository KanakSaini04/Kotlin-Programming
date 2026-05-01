fun multiplyByThree(x: Int) = x * 3

fun main() {
    val numbers = listOf(1, 2, 3)
    // Function reference obtained using :: operator
    val result = numbers.map(::multiplyByThree)
    println(result)
}