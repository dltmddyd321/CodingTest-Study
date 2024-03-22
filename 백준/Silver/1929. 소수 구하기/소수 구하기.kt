import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue
import java.util.Scanner
import java.util.Stack
import java.util.StringTokenizer
import kotlin.math.sqrt

fun main() {
    val NM = readln().split(" ")
    val N = NM[0].toInt()
    val M = NM[1].toInt()

    //초기 배열
    val check = BooleanArray(M + 1){true}

    for (n in N..M) {
        val sqrt = sqrt(n.toDouble()).toInt()
        // 2부터 N의 제곱근까지의 수까지 나눠서 나누지면 반복문 종료
        for (i in 2..sqrt){
            if (n % i == 0) {
                check[n] = false
                break
            }
        }
    }

    for (i in N..M){
        if (i == 1) continue
        if (check[i]) println(i)
    }
}