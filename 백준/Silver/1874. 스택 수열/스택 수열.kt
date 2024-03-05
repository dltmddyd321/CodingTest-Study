import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue
import java.util.Scanner
import java.util.Stack
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    val stack = Stack<Int>()
    val arr = IntArray(readLine().toInt()) { readLine().toInt() }
    var cur = 1

    for (num in arr) {
        // 추가해야 하는 수가 수열의 현재 수 이하면 스택에 계속 추가
        while (cur <= num) {
            stack.push(cur++)
            sb.append("+\n")
        }
        // 스택의 가장 위 값이 수열의 현재 수와 같으면 스택에서 제거
        if (stack.peek() == num) {
            stack.pop()
            sb.append("-\n")
        }
        // 스택의 가장 위 값이 수열의 현재 수와 다르면(크면) 더 작은 수를 추가할 수 없으므로 프로그램 종료
        else {
            println("NO")
            return@with
        }
    }
    println(sb)
}