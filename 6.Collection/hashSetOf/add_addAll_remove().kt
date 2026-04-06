fun main() {
    val set = hashSetOf<Int>()
    println(set)
    
    set.addAll(listOf(1, 2, 4, 5, 6))
    println(set) 
    
    set.remove(2)
    println(set) 
}