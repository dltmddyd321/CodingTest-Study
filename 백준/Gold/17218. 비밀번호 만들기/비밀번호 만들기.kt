import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val arr = Array(2) { readLine() }
    val dp = Array(arr[0].length + 1) { IntArray(arr[1].length + 1) }
    
    for (i in 0 until arr[0].length) {
        for (j in 0 until arr[1].length) {
            if (arr[0][i] == arr[1][j]) dp[i + 1][j + 1] = dp[i][j] + 1
            else dp[i + 1][j + 1] = maxOf(dp[i][j + 1], dp[i + 1][j])
        }
    }

    val sb = StringBuilder()
    val index = IntArray(2) { 0 }.also {
        it[0] = arr[0].length
        it[1] = arr[1].length
    }

    with(index) {
        var i = this[0]
        var j = this[1]

        while (dp[i][j] != 0) {
            if (dp[i][j] == dp[i - 1][j]) i -= 1
            else if (dp[i][j] == dp[i][j - 1]) j -= 1
            else {
                sb.append(arr[0][i - 1])
                i -= 1
                j -= 1
            }
        }
    }

    bw.write(sb.reversed().toString())
    bw.flush()
    bw.close()
}