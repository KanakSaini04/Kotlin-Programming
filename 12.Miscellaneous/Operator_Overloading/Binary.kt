class Score(val value: Int) : Comparable<Score> {
    override fun compareTo(other: Score): Int {
        return this.value - other.value
    }
}

fun main() {
    val s1 = Score(10)
    val s2 = Score(15)
    println(s1 < s2)
}