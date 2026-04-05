fun main(args: Array<String>) {
    var a = 15
    var b = 12
    var c = 11
    // call using dot and parenthesis
    var result1 =(a > b).and(a > c)           
    println("Boolean result1 = $result1")
    // call using infix notation
    var result2 =(a > b) and (a > c)          
    println("Boolean result1 = $result2")
}