import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.abs
import kotlin.math.max

fun main() = with(System.`in`.bufferedReader()) {
    val (N, M) = readLine().split(" ").map { it.toInt() }
    val castle = Array(N) { readLine().toCharArray() } //구조를 입력받는다.
    val row = BooleanArray(M) { false }
    val col = BooleanArray(N) { false }

    for (i in 0 until N) for (j in 0 until M) {
        if (castle[i][j] == 'X') {
            col[i] = true
            row[j] = true
        }
    }

    println(max(row.count { !it }, col.count { !it }))
}
