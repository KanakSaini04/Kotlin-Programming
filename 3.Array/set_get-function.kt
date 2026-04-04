fun main()
{   // declare an array using arrayOf()
    val num = arrayOf(1, 2, 3, 4, 5)

    num.set(0, 10)  // set the first element equal to 10
    num.set(1, 6)   // set the secondelement equal to 6

    println(num.get(0)) // print the first element using get()
    println(num[1]) // print the second element using []
}