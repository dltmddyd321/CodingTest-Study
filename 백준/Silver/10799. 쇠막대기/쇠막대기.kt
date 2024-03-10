import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(System.out.bufferedWriter()) {
    val input = System.`in`.bufferedReader().readLine()
    var answer = 0
    var base = 0
    var idx = 0
    val stk = Stack<Char>()
    while (idx < input.length) {
        when (val ch = input[idx]) {
            '(' -> {
                if (idx + 1 < input.length && input[idx + 1] == ')') {
                    //짝이 맞을 경우 : 레이저
                    answer += stk.size
                    idx++
                } else { //짝을 찾을 때까지 스택에 쌓아둔다.
                    stk.add(ch)
                    base++
                }
            }

            else -> {
                if (stk.isNotEmpty()) {
                    stk.pop()
                }
            }
        }
        idx++
    }
    write("${answer + base}")
    close()
}