import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue
import java.util.Scanner
import java.util.Stack
import java.util.StringTokenizer
import kotlin.math.sqrt

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val leftStack = readLine().map { it.toString() }.toMutableList()
    val rightStack = mutableListOf<String>() // 리스트로 스택 구현
    val n = readLine().toInt()

    repeat(n) {
        when (val cmd = readLine()) {
            "L" -> {
                if (leftStack.isNotEmpty()) {
                    //커서를 기준으로 스택을 분리한다.
                    rightStack.add(leftStack.removeAt(leftStack.lastIndex))
                }
            }
            "D" -> {
                if (rightStack.isNotEmpty()) {
                    leftStack.add(rightStack.removeAt(rightStack.lastIndex))
                }
            }
            "B" -> {
                if (leftStack.isNotEmpty()) {
                    leftStack.removeAt(leftStack.lastIndex)
                }
            }
            else -> leftStack.add(cmd[2].toString())
        }
    }
    val answer = StringBuilder()
    leftStack.forEach { answer.append(it) }
    for (i in rightStack.lastIndex downTo 0) { // 오른쪽 스택은 top부터 문자를 읽어야 한다
        answer.append(rightStack[i])
    }
    print(answer)
}