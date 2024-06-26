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

fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    val dp = Array(n + 1) { 0L }
    dp[1] = 1

    for (i in 2..n) {
        dp[i] = dp[i - 2] + dp[i - 1]
    }
    println(dp[n])
}