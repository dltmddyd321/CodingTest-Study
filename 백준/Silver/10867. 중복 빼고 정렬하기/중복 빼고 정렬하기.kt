import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.text.SimpleDateFormat
import java.time.OffsetDateTime
import java.time.ZoneId
import java.util.Arrays
import java.util.Calendar
import java.util.Collections
import java.util.LinkedList
import java.util.Locale
import java.util.PriorityQueue
import java.util.Queue
import java.util.Scanner
import java.util.Stack
import java.util.StringTokenizer
import java.util.regex.Pattern

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val st = StringTokenizer(br.readLine())
    val sb = StringBuilder()

    val set = mutableSetOf<Int>()

    repeat(n) {
        set.add(st.nextToken().toInt())
    }

    set.sorted().forEach {
        sb.append("$it ")
    }
    println(sb.trim())
}