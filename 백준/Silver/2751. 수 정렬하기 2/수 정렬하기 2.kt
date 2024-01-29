import java.util.*
import kotlin.collections.ArrayList

fun main() = with(Scanner(System.`in`)) {
    val stringBuilder = StringBuilder()

    val n = nextInt()
    val list = ArrayList<Int>()

    for(i in 0 until n) {
        list.add(nextInt())
    }

    list.sort()

    for(i in list) {
        stringBuilder.append(i).append("\n")
    }

    println(stringBuilder)
}