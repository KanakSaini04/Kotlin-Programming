class Add1 {
    constructor(a: Int, b: Int, c: Int) {
        println("Sum of $a, $b, $c = ${a + b + c}")
    }

    constructor(a: Int, b: Int) : this(a, b, 7) {
        println("Sum of two numbers $a and $b is: ${a + b}")
    }
}

fun main() {
    val add = Add1(5, 6)
    println(add)
}