// base class
open class Animals{
    open var name: String = "Dog"
    open var speed = "40 km/hr"

}
// derived class
class Tigers: Animals() {
    override var name = "Tiger"
    override var speed = "100 km/hr"
}
fun main(args: Array<String>) {
    val t = Tigers()
    println(t.name+" can run at speed "+t.speed)
}