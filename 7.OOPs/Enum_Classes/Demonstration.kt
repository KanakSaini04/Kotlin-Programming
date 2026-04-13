enum class DAYSs(val isWeekend: Boolean = false) {

    SUNDAY(true),
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY(true);

    companion object {
        fun today(obj: DAYSs): Boolean {
            return obj.name == "SATURDAY" || obj.name == "SUNDAY"
        }
    }
}

fun main() {

    // Print all values
    for (day in DAYSs.values()) {
        println("${day.ordinal} = ${day.name} and is weekend ${day.isWeekend}")
    }

    val today = DAYSs.MONDAY
    println("Is today a weekend: ${DAYSs.today(today)}")
}