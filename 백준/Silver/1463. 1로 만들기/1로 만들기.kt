import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

fun main() {
    BufferedReader(InputStreamReader(System.`in`)).use { reader ->
        val input = reader.readLine()
        val x = input.toInt()

        val dp: MutableList<Int> = mutableListOf(0, 0)
        for (i in 2 .. x) {
            dp.add(dp[i - 1] + 1)

            if (i % 2 == 0) dp[i] = min(dp[i], dp[i / 2] + 1)
            if (i % 3 == 0) dp[i] = min(dp[i], dp[i / 3] + 1)
        }

        println(dp[x])
    }
}