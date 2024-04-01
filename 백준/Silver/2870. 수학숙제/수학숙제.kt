import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Arrays
import java.util.LinkedList
import java.util.Queue
import java.util.Scanner
import java.util.Stack
import java.util.StringTokenizer
import java.util.regex.Matcher
import java.util.regex.Pattern
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = java.lang.StringBuilder()
    val result = ArrayList<String>()
    val pattern: Pattern = Pattern.compile("\\d+")
    val M = br.readLine().toInt()
    for (i in 0 until M) {
        val input = br.readLine()
        val matcher: Matcher = pattern.matcher(input)
        while (matcher.find()) {
            val num = matcher.group().replace("^0+".toRegex(), "")
            result.add(num.ifEmpty { "0" })
        }
    }
    result.sortWith { o1: String, o2: String ->
        if (o1.length == o2.length) o1.compareTo(o2
        ) else o1.length - o2.length
    }
    for (s in result) sb.append(s).append('\n')
    println(sb)
    br.close()
}