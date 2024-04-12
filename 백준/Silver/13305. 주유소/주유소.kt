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
    val n = readln().toInt()
    val distances = readln().split(' ').map { it.toLong() }
    val prices = readln().split(' ').map { it.toLong() }

    var cur = prices[0]
    var res = 0L

    for (i in distances.indices) {
        val nextPrice = prices[i + 1]
        if (cur < nextPrice) {
            res += cur * distances[i]
        } else {
            res += cur * distances[i]
            cur = nextPrice
        }
    }
    println(res)
}