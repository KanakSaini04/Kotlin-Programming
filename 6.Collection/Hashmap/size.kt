fun main() {
    // HashMap can also be initialize with its initial capacity.
    // The capacity can be changed by adding and replacing its element.
    var hashMap : HashMap<String, Int> = HashMap<String, Int> (4)

    // use put() to add elements
    hashMap.put("IronMan" , 3000)
    hashMap.put("Thor" , 100)
    hashMap.put("SpiderMan" , 1100)
    hashMap.put("NickFury" , 1200)

    for(key in hashMap.keys) {
        println("Element at key $key : ${hashMap[key]}")
    }
    
    // returns the size
    println("\n" + "hashMap.size : " + hashMap.size )

    // add new element
    hashMap["BlackWidow"] = 1000;
    println("hashMap.size : " + hashMap.size + "\n")

    for(key in hashMap.keys) {
        println("Element at key $key : ${hashMap[key]}")
    }
}