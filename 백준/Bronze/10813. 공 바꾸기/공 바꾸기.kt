import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val N = nextInt()
    val M = nextInt()
    val buckets = IntArray(N) { it + 1 } //1부터 N까지 담기

    for (time in 0 until M) {
        val i = nextInt()
        val j = nextInt()

        val temp = buckets[i - 1]
        buckets[i - 1] = buckets[j - 1]
        buckets[j - 1] = temp
    }

    buckets.forEach { print("$it ") }
}