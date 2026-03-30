//Data Types  -> Boolean , Byte ,  Short , Char , Int , Float , Long , Double
    
fun main(args: Array<String>) {
    
    var alphabet: Char = 'C'
    println("C is a character : ${alphabet is Char}")
    
    var s : String = "Hello , "
    println("${s} welcome")
    
    var m1 : Int = Int.MIN_VALUE
    var a1 : Int = Int.MAX_VALUE
    println("Int min_value"+m1)
    println("Int max_value"+a1)
    
    var m2 : Float = Float.MIN_VALUE
    var a2 : Float = Float.MAX_VALUE
    println("Float min_value"+m2)
    println("Float max_value"+a2)
    
    if (true is Boolean){ 
        print("Yes,true is a boolean value") 
    } 

    var D1: Double = Double.MIN_VALUE 
    var D2: Double = Double.MAX_VALUE 
    println("Smallest Double value: " + D1) 
    println("Largest Double value: " + D2) 
 var myint = 35
  
    // add suffix L for long integer 
    var mylong = 23L 
    
    println("My integer ${myint}") 
    println("My long integer ${mylong}") 

    var b1: Byte = Byte.MIN_VALUE 
    var b2: Byte = Byte.MAX_VALUE 
    println("Smallest byte value: " +b1) 
    println("Largest byte value: " +b2) 

    var S1: Short = Short.MIN_VALUE 
    var S2: Short = Short.MAX_VALUE 
    println("Smallest short value: " +S1) 
    println("Largest short value: " +S2) 
    
    var L1: Long = Long.MIN_VALUE 
    var L2: Long = Long.MAX_VALUE 
    println("Smallest long integer value: " +L1) 
    println("Largest long integer value: " +L2) 
    
  
  
    
    
}