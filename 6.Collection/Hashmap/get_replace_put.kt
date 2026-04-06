fun main() {
    var hashMap : HashMap<String, Int> = HashMap<String, Int> ()

    // using put() function to add elements
    hashMap.put("IronMan" , 3000)
    hashMap.put("Thor" , 100)
    hashMap.put("SpiderMan" , 1100)
    hashMap.put("Cap" , 1200)

    for(key in hashMap.keys) {
        println("Element at key $key : ${hashMap[key]}")
    }

    // access elements
    println("\nhashMap[\"IronMan\"] : " + hashMap["IronMan"])
    hashMap["Thor"] = 2000
    println("hashMap.get(\"Thor\") : " + hashMap.get("Thor") + "\n")

    // replacing values
    hashMap.replace("Cap" , 999);
    hashMap.put("Thor" , 2000);

    println("hashMap.replace(\"Cap\" , 999)" + " hashMap.replace(\"Thor\" , 2000)) :")

    for(key in hashMap.keys) {
        println("Element at key $key : ${hashMap[key]}")
    }
}