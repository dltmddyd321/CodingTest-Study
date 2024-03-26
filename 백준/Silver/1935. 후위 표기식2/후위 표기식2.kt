import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue
import java.util.Scanner
import java.util.Stack
import java.util.StringTokenizer

fun main() = with(System.out.bufferedWriter()) {
    val br = System.`in`.bufferedReader()
    val set = DoubleArray(200)
    fun cal(l: Double, r: Double, ch: Char): Double = when (ch) {
        '*' -> l * r

        '-' -> l - r

        '+' -> l + r

        else -> l / r
    }

    val n = br.readLine().toInt()
    val input = br.readLine()
    val stk = Stack<Double>()
    for (i in 0 until n) {
        ('A' + i).code
        set[('A' + i).code] = br.readLine().toDouble()
    }

    for (ch in input) {
        if (ch.isLetter()) {
            stk.push(set[ch.code])
        } else {
            val r = stk.pop()
            val l = stk.pop()
            stk.push(cal(l, r, ch))
        }
    }
    write(String.format("%.2f", stk.pop()))
    close()
}