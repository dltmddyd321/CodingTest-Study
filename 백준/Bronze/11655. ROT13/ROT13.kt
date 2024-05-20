import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
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
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) {
    val input = readLine()
    var answer = ""

    input.forEach {
        answer += if (it in 'a'..'z') {
            if (it + 13 > 'z') {
                it + 13 - ('a'..'z').count()
            } else {
                it + 13
            }
        } else if (it in 'A'..'Z') {
            if (it + 13 > 'Z') {
                it + 13 - ('A'..'Z').count()
            } else {
                it + 13
            }
        } else {
            it
        }
    }
    println(answer)
}