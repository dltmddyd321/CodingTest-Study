import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.time.OffsetDateTime
import java.time.ZoneId
import java.util.*
import java.util.regex.Pattern
import kotlin.collections.ArrayDeque
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.roundToInt
import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val st = StringTokenizer(readLine())
    val arr = Array(n) { st.nextToken().toInt() }
    val dp = Array(n) { 0 }

    dp[0] = arr.first()
    var max = arr.first()

    for (i in 1 until n) {
        dp[i] = max(dp[i - 1] + arr[i], arr[i])
        max = max(max, dp[i])
    }
    println(max)
}