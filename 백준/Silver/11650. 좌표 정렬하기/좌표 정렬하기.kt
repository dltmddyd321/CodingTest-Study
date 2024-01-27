import java.util.*

fun main() = with(Scanner(System.`in`)) {
    data class Point(
        val x: Int,
        val y: Int
    )

    val arr = mutableListOf<Point>()
    val size = nextInt()
    repeat(size) {
        arr.add(Point(nextInt(), nextInt()))
    }
    val sortedArr = arr.sortedWith(compareBy(Point::x, Point::y))
    sortedArr.forEach { point ->
        println("${point.x} ${point.y}")
    }
}