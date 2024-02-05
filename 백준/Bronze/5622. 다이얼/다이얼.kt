import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val dial = arrayOf("ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ")
    val word = next().toString()
    var res = 0

    for (i in word.indices) {
        for (j in dial) {
            if (j.contains(word[i])) res += dial.indexOf(j) + 3
        }
    }
    println(res)
}