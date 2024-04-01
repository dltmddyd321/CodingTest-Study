import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val n = nextInt()
    val k = nextInt()
    var cnt = 0

    val list = mutableListOf<Boolean>()
    repeat(n + 1) { list.add(false) }

    for (i in 2..n) {
        for (j in i..n step i) {
            if (!list[j]) {
                cnt++
                list[j] = true
            }
            if (cnt == k) {
                println(j)
                return@with
            }
        }
    }
}