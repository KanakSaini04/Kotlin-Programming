fun main(args: Array<String>) {
    // creating empty arraylist using constructor
    var arraylist=ArrayList<String>()
    // adding elements
    arraylist.add("Geeks")
    arraylist.add("for")
    arraylist.add("Geeks:")
    arraylist.add("Portal")
    // iterating through the elements
    for(i in arraylist)
        print("$i ")
    println()
    // set the element at index 3 with new string
    arraylist.set(3,"A computer Science portal for students")
    // iterating through the elements
    for(i in arraylist)
        print("$i ")
}