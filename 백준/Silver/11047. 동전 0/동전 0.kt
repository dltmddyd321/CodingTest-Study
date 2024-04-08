import java.io.*

fun main() {
    val br = System.`in`.bufferedReader()
    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    val coins = Array(n) { br.readLine().toInt() }
    var res = 0
    var tmp = k

    for (index in n - 1 downTo 0) {
        res += tmp / coins[index]
        tmp %= coins[index]
    }
    
    println(res)
}