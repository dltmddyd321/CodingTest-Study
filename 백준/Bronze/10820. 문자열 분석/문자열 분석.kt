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
    val br = BufferedReader(InputStreamReader(System.`in`))
    while (true) {
        try {
            val line = br.readLine()

            var upper = 0
            var lower = 0
            var space = 0
            var num = 0

            for (i in line.indices) {
                val char = line[i]

                if (char == ' ') {
                    space++
                } else if (char.isDigit()) {
                    num++
                } else if (char.isLowerCase()) {
                    lower++
                } else {
                    upper++
                }
            }
            println("$lower $upper $num $space")
        } catch (e: Exception) {
            break
        }
    }
}
