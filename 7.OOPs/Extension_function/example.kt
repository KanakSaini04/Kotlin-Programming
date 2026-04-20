class Circle(val radius: Double) {
    fun area(): Double {
        return Math.PI * radius * radius
    }
}

// Extension function
fun Circle.perimeter(): Double {
    return 2 * Math.PI * radius
}

fun main() {
    val circle = Circle(2.5)
    println("Area of the circle is ${circle.area()}")
    println("Perimeter of the circle is ${circle.perimeter()}")
}