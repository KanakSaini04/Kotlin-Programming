class Car {
    var brand: String = ""
    var model: String = ""
    var year: Int = 0

    fun getInfo(): String {
        return "$brand $model, year $year"
    }
}

fun main() {
    val myCar = Car()
    myCar.brand = "Toyota"
    myCar.model = "Camry"
    myCar.year = 2020

    println(myCar.getInfo())
}