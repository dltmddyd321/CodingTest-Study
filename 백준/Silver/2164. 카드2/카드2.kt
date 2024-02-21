import java.util.*
import kotlin.collections.ArrayList
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(Scanner(System.`in`)) {
    val n = nextInt()
    val queue: Queue<Int> = LinkedList()

    repeat(n) {
        queue.add(it + 1)
    }
    while (queue.size != 1) {
        queue.poll()
        queue.add(queue.poll())
    }
    println(queue.first())
}