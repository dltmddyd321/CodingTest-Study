import java.util.*

fun main() = with(Scanner(System.`in`)) {

    fun sums(number: Int): Int {
        var sum = 0
        for (c in number.toString()) sum += c - '0'
        return sum
    }

    val n = nextInt()
    val length = n.toString().length
    for (i in n - 9 * length .. n) {
        if (sums(i) + i == n) {
            println(i)
            return@with
        }
    }
    println(0)
}