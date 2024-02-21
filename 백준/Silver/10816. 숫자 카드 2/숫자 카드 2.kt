import java.util.*
import kotlin.collections.ArrayList
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()

    val inputN = readLine().split(" ").map {it.toInt()}

    val m = readLine().toInt()

    val inputM = readLine().split(" ").map {it.toInt()}

    val hashMap = HashMap<Int,Int>() //카운트를 담는 Map

    repeat(n) {
        //첫번째 입력인 n 만큼 반복하여 만약 배열의 숫자가 여러개라면 1씩 누적시키는 코드입니다.
        //getOrDefault로 처음 hashMap에 들어갈 때, 0으로 들어가도록 해줬습니다.
        hashMap[inputN[it]] = hashMap.getOrDefault(inputN[it],0) + 1
    }

    repeat(m) {
        bw.write("${hashMap[inputM[it]] ?: 0} ")
    }

    bw.flush()
    bw.close()
}