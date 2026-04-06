fun main(args: Array<String>) {
    // creating empty arraylist using constructor
    var arraylist=ArrayList<String>()
    //adding String elements in the list
    arraylist.add("Geeks")
    arraylist.add("For")
    arraylist.add("Geeks")
    // creating new arraylist1
    var arraylist1=ArrayList<String>()
    //adding all elements from arraylist to arraylist1
    println("Elements in arraylist1 -->")
    arraylist1.addAll(arraylist)
    for(i in arraylist1)
        println(i)
}