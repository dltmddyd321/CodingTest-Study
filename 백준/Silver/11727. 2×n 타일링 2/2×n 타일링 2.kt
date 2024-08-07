import java.util.*


fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val dp = IntArray(1001)
    dp[1] = 1
    dp[2] = 3
    for (i in 3..n) {
        dp[i] = (dp[i - 1] + 2 * dp[i - 2]) % 10007
    }
    println(dp[n])
}