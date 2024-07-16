fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
 
    val mod = 10007
    val num = br.readLine().toInt()
    val dp = IntArray(1001)
 
    dp[1] = 1
    dp[2] = 2
 
    for(i in 3 .. num) {
        dp[i] = (dp[i - 1] + dp[i - 2]) % mod
    }
 
    bw.write("${dp[num]}")
    bw.flush()
    bw.close()
    br.close()
}
