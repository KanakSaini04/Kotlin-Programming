enum class DAYs{
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}
 
fun checkDay(day: DAYs) {
    when (day) {
        DAYs.SUNDAY -> println("Today is Sunday")
        DAYs.MONDAY -> println("Today is Monday")
        DAYs.TUESDAY -> println("Today is Tuesday")
        DAYs.WEDNESDAY -> println("Today is Wednesday")
        DAYs.THURSDAY -> println("Today is Thursday")
        DAYs.FRIDAY -> println("Today is Friday")
        DAYs.SATURDAY -> println("Today is Saturday")
    }
}