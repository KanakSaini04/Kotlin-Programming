fun main(args: Array<String>) {
        var a: Container<Dog> = Container<Animal>() //compiles without error
        var b: Container<Animal> = Container<Dog>() //gives compilation error
}
open class AnimalA
class Dog : AnimalA()
class Container<in T>