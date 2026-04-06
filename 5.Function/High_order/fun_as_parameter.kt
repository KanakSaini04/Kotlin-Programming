// regular function definition
fun printMe(s:String): Unit{
    println(s)
}
   // higher-order function definition
fun higherfunc( str : String, myfunc: (String) -> Unit){
   // invoke regular function using local name
    myfunc(str)
}
fun main(args: Array<String>) {
    // invoke higher-order function
    higherfunc("GeeksforGeeks: A Computer Science portal for Geeks",::printMe)
}