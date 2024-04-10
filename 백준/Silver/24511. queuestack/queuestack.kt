import java.io.*
import java.util.Arrays
import java.util.Deque
import java.util.LinkedList
import java.util.Queue
import java.util.Scanner
import java.util.Stack
import java.util.StringTokenizer
import java.util.TreeMap
import java.util.regex.Matcher
import java.util.regex.Pattern
import kotlin.math.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val num = br.readLine().toInt()
    val mode = br.readLine().split(' ').map { it.toInt() }
    val queueStack = br.readLine().split(' ').map { it.toInt() }
    var m = br.readLine().toInt()
    val insert = br.readLine().split(' ').map { it.toInt() }

    val sb = StringBuilder()
    for (i in num - 1 downTo 0) { // 마지막 큐부터 출력 -> 큐스택
        if (m == 0) break // 삽입된만큼 출력하면 종료
        if (mode[i] == 0) { // 큐
            sb.append("${queueStack[i]} ")
            m--
        }
    }
    for (i in insert.indices) { // 삽입된 원소 출력
        if (m == 0) break
        sb.append("${insert[i]} ")
        m--
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
    br.close()
}