// two parameters passed an array and size of array
fun sum(args: Array<Int>, index: Int): Int
{
    return if (index <= 0) 0 
    else(sum(args, index - 1)+ args[index - 1]) // recursive function call
}

fun main()
{
    // array initialization
    val array = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    // size of array
    val n = array.size 
    val result = sum(array, n) // normal function call
    println("The sum of array elements is: $result")
}