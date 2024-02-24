import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val queue: Deque<Int> = LinkedList()
    val sb = java.lang.StringBuilder()
    val N = br.readLine().toInt()
    var k = 0
    var l = 0
    for (i in 0 until N) {
        val t = br.readLine()
        if (t.startsWith("1") || t.startsWith("2")) {
            val tArr = t.split(" ".toRegex()).dropLastWhile { it.isEmpty() }
                .toTypedArray()
            k = tArr[0].toInt()
            l = tArr[1].toInt()
        } else {
            k = t.toInt()
        }
        when (k) {
            1 -> queue.addFirst(l)
            2 -> queue.add(l)
            3 -> if (queue.isEmpty()) {
                sb.append("-1").append("\n")
            } else {
                queue.pollFirst()?.let { sb.append(it).append("\n") }
            }
            4 -> if (queue.isEmpty()) {
                sb.append("-1").append("\n")
            } else {
                queue.pollLast()?.let { sb.append(it).append("\n") }
            }
            5 -> sb.append(queue.size).append("\n")
            6 -> if (queue.isEmpty()) {
                sb.append("1").append("\n")
            } else {
                sb.append("0").append("\n")
            }
            7 -> if (queue.isEmpty()) {
                sb.append("-1").append("\n") 
            } else {
                queue.peekFirst()?.let { sb.append(it).append("\n") }
            }
            8 -> if (queue.isEmpty()) {
                sb.append("-1").append("\n")
            } else {
                queue.peekLast()?.let { sb.append(it).append("\n") }
            }
        }
    }
    println(sb)
}