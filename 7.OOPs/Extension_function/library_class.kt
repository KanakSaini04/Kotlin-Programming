// Open class created to be inherited
open class N

// Class B inherits A
class M : N()

fun N.printInfo() = println("Called on A")
fun M.printInfo() = println("Called on B")

fun main() {
    val obj: N = M()
    obj.printInfo()
}