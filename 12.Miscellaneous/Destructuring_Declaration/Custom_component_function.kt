class Coordinates(val x: Int, val y: Int) {
    operator fun component1() = x
    operator fun component2() = y
}

fun main() {
    val point = Coordinates(5, 10)
    val (x, y) = point
    println("x: $x, y: $y")
}