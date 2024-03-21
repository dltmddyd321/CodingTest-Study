import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue
import java.util.Scanner
import java.util.Stack
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    fun GCD(a: Long, b: Long): Long {
        if (a % b == 0L) return b
        return GCD(b, a % b)
    }

    fun LCM(N: Long, M: Long, gcd: Long): Long = (N * M) / gcd

    val st = StringTokenizer(br.readLine())
    val N = st.nextToken().toLong()
    val M = st.nextToken().toLong()

    val gcd = GCD(N, M)
    val lcm = LCM(N, M, gcd)
    println(gcd)
    println(lcm)
}