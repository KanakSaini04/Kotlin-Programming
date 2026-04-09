class Add {
    var c: Int = 0

    constructor(a: Int, b: Int) {
        c = a + b
        println("The sum of numbers $a and $b is: $c")
    }
}

fun main() {
    val add = Add(5, 6)
}