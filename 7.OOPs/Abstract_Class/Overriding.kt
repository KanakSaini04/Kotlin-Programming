open class LivingThings {
    open fun breathe() {
        println("All living things breathe")
    }
}

abstract class Animalss: LivingThings() {
    abstract override fun breathe()
}

class Dog : Animalss() {
    override fun breathe() {
        println("Dog can also breathe")
    }
}

fun main() {
    val dog = Dog()
    dog.breathe()
}