import java.util.*

fun main() = with(Scanner(System.`in`)) {
    var res = ""
    val word = Array(5) { CharArray(15) { ' ' } }
    var maxSize = 0

    for (i in 0 until 5) {
        val input = next()
        maxSize = maxSize.coerceAtLeast(input.length)
        word[i] = input.toCharArray()
    }

    for (i in 0 until maxSize) {
        for (j in 0 until 5) {
            if (word[j].getOrNull(i) == null) continue
            res += word[j][i]
        }
    }
    println(res)
}