import java.util.*
import kotlin.collections.ArrayList

fun main() = with(Scanner(System.`in`)) {
    val N = nextInt()
    val k = nextInt()
    val score = IntArray(N) { nextInt() }.sortedDescending()

    print(score[k - 1])
}