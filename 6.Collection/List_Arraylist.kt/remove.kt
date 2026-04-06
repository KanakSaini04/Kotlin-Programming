fun main(args: Array<String>) {
    // creating empty arraylist using constructor
    var arraylist=ArrayList<String>()
    // adding elements
    arraylist.add("Geeks")
    arraylist.add("for")
    arraylist.add("Geeks")

    arraylist.remove("for")
    // iterating through the elements
    for(i in arraylist)
        print("$i ")
}