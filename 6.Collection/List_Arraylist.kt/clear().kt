fun main(args: Array<String>) {
    // creating empty arraylist using constructor
    var arraylist=ArrayList<Int>()
    // adding elements
    arraylist.add(10)
    arraylist.add(20)
    arraylist.add(30)
    arraylist.add(40)
    arraylist.add(50)

    // iterating through the elements
    for(i in arraylist)
        print("$i ")
    arraylist.clear()
    println()
    println("The size of arraylist after clearing all elements: "+arraylist.size)
}