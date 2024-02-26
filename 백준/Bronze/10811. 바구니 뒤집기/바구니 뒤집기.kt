import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val mu = mutableListOf<Int>()

    val (N, M) = br.readLine().split(" ").map { it.toInt() }

    repeat(N) {
        mu.add(it + 1)
    }

    repeat(M) {
        val (i, j) = br.readLine().split(" ").map { it.toInt() }
        val sliceReverse = mu.slice(i - 1 until j).reversed()  //생성된 list를 i-1 부터 j-1까지 slice 한 후 reverse
        for ((index, k) in (i - 1 until j).withIndex()) {
            mu[k] = sliceReverse[index]  //slice 후 reverse 한 값을 넣어준다.
        }
    }

    for (k in 0 until N) {
        print(mu[k].toString() + " ")   //결과 출력
    }
}