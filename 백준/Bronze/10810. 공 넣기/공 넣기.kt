import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val resArr = mutableListOf<Int>()
    val size = nextInt()
    val line = nextInt()

    repeat(size) { resArr.add(0) }

    repeat(line) {
        val start = nextInt()
        val end = nextInt()
        val num = nextInt()
        for (i in start - 1 until end) {
            resArr[i] = num
        }
    }

    println(resArr.joinToString(" "))
}