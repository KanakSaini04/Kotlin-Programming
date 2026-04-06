fun main(args: Array<String>) {
    var a = 8

    // // call using infix notation
    var result1 = a shr 2
    println("Signed shift right by 2 bit: $result1")
    // call using dot and parenthesis
    var result2 = a.shr(1)
    println("Signed shift right by 1 bit: $result2")
}