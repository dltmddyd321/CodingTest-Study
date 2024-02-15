import java.util.*
import kotlin.collections.ArrayList
import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(Scanner(System.`in`)) {
    val (n, m) = readLine()?.split(" ")?.map { it.toInt() } ?: emptyList()
    val hashSet = HashSet<String>()

    repeat(n) {
        readLine()?.let { value -> hashSet.add(value) }
    }

    var cnt = 0
    repeat(m) {
        if (hashSet.contains(readLine())) cnt++
    }

    println(cnt)
}