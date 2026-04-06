// function declaration
fun mul(a: Int, b: Int): Int{
    return a*b
}
    //higher-order function declaration
fun higherfunc() : ((Int,Int)-> Int){
    return ::mul
}
fun main(args: Array<String>) {
     // invoke function and store the returned function into a variable 
    val multiply = higherfunc()  
    // invokes the mul() function by passing arguments
    val result = multiply(2,4)   
    println("The multiplication of two numbers is: $result")
}