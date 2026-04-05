class math {
    // user defined infix member function
    infix fun square(n : Int): Int{
        val num = n * n
        return num
    }
}
fun main(args: Array<String>) {
   val m = math()
    // call using infix notation
    val result = m square 3
    print("The square of a number is: "+result)
}