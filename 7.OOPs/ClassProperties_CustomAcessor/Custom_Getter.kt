class Rectangle(val width: Int, val height: Int) {
    val isSquare: Boolean
        get() = width == height
}

fun main() {
    val rect = Rectangle(10, 20)
    println(rect.isSquare)
}