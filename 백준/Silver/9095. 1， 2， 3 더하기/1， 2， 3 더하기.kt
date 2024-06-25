import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.time.OffsetDateTime
import java.time.ZoneId
import java.util.*
import java.util.regex.Pattern

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val dp = IntArray(11)
    dp[1] = 1
    dp[2] = 2
    dp[3] = 4

    for (i in 4..10) {
        dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1]
    }

    val str = StringBuilder()
    val a = br.readLine().toInt()

    repeat(a) {
        str.append("${dp[br.readLine().toInt()]}\n")
    }

    bw.write("$str")
    bw.flush()
    bw.close()
    br.close()
}