import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = java.lang.StringBuilder()
    val stack = Stack<Int>() //스택 생성

    var st: StringTokenizer
    val N = br.readLine().toInt()
    for (i in 0 until N) {
        st = StringTokenizer(br.readLine())
        val command = st.nextToken()
        if (command == "1") stack.push(st.nextToken().toInt()) else if (command == "2") {
            if (!stack.isEmpty()) {
                sb.append(stack.lastElement()).append("\n")
                stack.pop()
            } else sb.append(-1).append("\n")
        } else if (command == "3") sb.append(stack.size).append("\n")
        else if (command == "4")
            if (stack.isEmpty()) sb.append(1).append("\n")
            else sb.append(0).append("\n")
        else if (command == "5")
            if (stack.isEmpty()) sb.append(-1).append("\n")
            else sb.append(stack.lastElement()).append("\n")
    }
    br.close()
    println(sb)
}