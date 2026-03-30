fun main() {
     var a = 20 
    var b = 4 
    
    // Arithmatic operators
    println("a + b = " + (a + b))
    println("a - b = " + (a - b))
    println("a * b = " + (a.times(b)))
    println("a / b = " + (a / b))
    println("a % b = " + (a.rem(b)))
    println()
    
    //Relational operator
    
    var c = 30
    var d = 40
    println("c > d = "+(c>d))
    println("c < d = "+(c.compareTo(d) < 0))
    println("c >= d = "+(c>=d))
    println("c <= d = "+(c.compareTo(d) <= 0))
    println("c == d = "+(c==d))
    println("c != d = "+(!(c?.equals(d) ?: (d === null))))
    prinln()
    
    //Assignment operator
    
     var b = 5
    a+=b
    println(a)
    a-=b
    println(a)
    a*=b
    println(a)
    a/=b
    println(a)
    a%=b
    println(a)
    
    //Logical operator
     var x = 100
    var y = 25
    var z = 10
    var result = false
    if(x > y && x > z)
     println(x)
    if(x < y || x > z)
     println(y)
    if( result.not())
     println("Logical operators")
     
     //Bitwise operators
     
    println("5 signed shift left by 1 bit: " + 5.shl(1))
    println("10 signed shift right by 2 bits: : " + 10.shr(2))
    println("12 unsigned shift right by 2 bits:  " + 12.ushr(2))
    println("36 bitwise and 22: " + 36.and(22))
    println("36 bitwise or 22: " + 36.or(22))
    println("36 bitwise xor 22: " + 36.xor(22))
    println("14 bitwise inverse is: " + 14.inv())
    
    
}