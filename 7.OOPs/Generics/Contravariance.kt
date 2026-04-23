fun main(args: Array<String>) {
        var a: Container<Dog> = Container<Animal>() //compiles without error
        var b: Container<Animal> = Container<Dogs>() //gives compilation error
}
open class AnimalA
class Dogs : AnimalA()
class Container<in T>