data class Square(val side: Int)

fun main() {
    val square1 = Square(5)
    val square2 = Square(5)
    val square3 = square1

    // Structural Equality
    if (square1 == square2) {
        println("Two squares are structurally equal")
    } else {
        println("Two squares are not structurally equal")
    }

    // Referential Equality
    if (square1 === square2) {
        println("Two squares are referentially equal")
    } else {
        println("Two squares are not referentially equal")
    }

    // Referential Equality with the same reference
    if (square1 === square3) {
        println("square1 and square3 refer to the same instance")
    }
}