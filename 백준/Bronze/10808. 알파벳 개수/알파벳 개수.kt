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

fun main() {
    val scanner = Scanner(System.`in`)
    val alphabetMap = HashMap<Char, Int>()
    for (char in 'a'..'z') {
        alphabetMap[char] = 0
    }
    val input = scanner.nextLine()
    input.forEach {
        alphabetMap[it] = alphabetMap.getValue(it) + 1
    }
    println(alphabetMap.values.joinToString(" "))
}