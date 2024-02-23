import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val num = br.readLine().toInt()
    val stack = Stack<Int>()

    var checkCnt = 1
    br.readLine().split(" ").map { it.toInt() }.forEach {
        if (it == checkCnt) checkCnt++
        else {
            while (stack.isNotEmpty()) {
                if (stack.peek() == checkCnt) {
                    stack.pop()
                    checkCnt++
                } else break //값이 다르면 break하고 push한다.
            }
            stack.push(it)
        }
    }

    //for문 다 돌았는데도 대기줄이 남았다?
    while (stack.isNotEmpty()) {
        if (stack.pop() == checkCnt) checkCnt++
        else break
    }

    bw.write(if (stack.isEmpty()) "Nice" else "Sad")
    bw.flush()
    bw.close()
    br.close()
}