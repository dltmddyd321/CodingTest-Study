import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue
import java.util.Scanner
import java.util.Stack
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var n = readLine().toInt()
    val q: Queue<Int> = LinkedList()
    while (n-- > 0) {
        val ip = readLine().split(' ')
        when (ip[0]) {
            "push" -> q.add(ip[1].toInt())
            "pop" -> println(if (q.isEmpty()) -1 else q.poll())
            "empty" -> println(if (q.isEmpty()) 1 else 0)
            "front" -> println(if (q.isEmpty()) -1 else q.peek())
            "back" -> println(if (q.isEmpty()) -1 else q.last())
            else -> println(q.size)
        }
    }
}