class Engine {
    class Specs {
        fun showSpecs() {
            println("250 horsepower, 6 cylinders")
        }
    }
}

fun main() {
    val specs = Engine.Specs()
    specs.showSpecs()
}