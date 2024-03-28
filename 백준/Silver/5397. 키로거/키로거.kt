import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue
import java.util.Scanner
import java.util.Stack
import java.util.StringTokenizer
import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) {
    val case = readLine().toInt()
    val answer = StringBuilder()

    for (i in 1..case) {
        val input = readLine()
        val pw = LinkedList<Char>()
        var cursor = 0

        for (c in input) {
            when (c) {
                '<' -> cursor = if (cursor > 0) cursor - 1 else 0
                '>' -> cursor = if (cursor < pw.size) cursor + 1 else pw.size
                '-' -> {
                    if (pw.isNotEmpty() && cursor > 0)
                        pw.removeAt(--cursor)
                }

                else -> {
                    pw.add(cursor++, c)
                }
            }
        }
        for (c in pw) {
            answer.append(c)
        }
        answer.append("\n")
    }
    print(answer.toString())
}