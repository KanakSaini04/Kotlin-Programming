fun main() {
    data class Box(val height: Int, val weight: Int)

    val boxes = listOf(
        Box(3, 25),
        Box(5, 50),
        Box(7, 95),
        Box(2, 10),
        Box(4, 10),
        Box(3, 45)
    )

    // First by height, then by weight
    val sortedByHeightThenWeight = boxes.sortedWith(
        compareBy<Box> { it.height }.thenBy { it.weight }
    )
    println("Sorted by Height then Weight:")
    println(sortedByHeightThenWeight)

    // First by weight, then by descending height
    val sortedByWeightThenHeightDesc = boxes.sortedWith(
        compareBy<Box> { it.weight }.thenByDescending { it.height }
    )
    println("Sorted by Weight then Height Descending:")
    println(sortedByWeightThenHeightDesc)

}