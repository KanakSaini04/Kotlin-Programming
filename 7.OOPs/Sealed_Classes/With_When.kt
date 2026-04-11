sealed class Fruit

class Apple : Fruit()
class Mango : Fruit()
class Pomegranate : Fruit()

fun describe(fruit: Fruit) {
    when (fruit) {
        is Apple -> println("Apple is good for iron")
        is Mango -> println("Mango is delicious")
        is Pomegranate -> println("Pomegranate is good for vitamin D")
    }
}

fun main() {
    describe(Apple())
    describe(Mango())
    describe(Pomegranate())
}