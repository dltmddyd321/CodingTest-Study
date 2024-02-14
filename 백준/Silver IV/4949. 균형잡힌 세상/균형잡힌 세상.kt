import java.util.*
import kotlin.collections.ArrayList
import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(System.`in`.bufferedReader()) {
    while (true) {
        val text = readLine()
        if (text == ".") {
            break
        }

        val stack = Stack<Char>()

        var isBalanced = true
        text.forEach {
            if (it == '(' || it == '[') {
                stack.push(it)
            } else if (it == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') stack.pop() else {
                    isBalanced = false
                    return@forEach
                }
            } else if (it == ']') {
                if (!stack.isEmpty() && stack.peek() == '[') stack.pop() else {
                    isBalanced = false
                    return@forEach
                }
            }
        }
        if (stack.isNotEmpty()) isBalanced = false
        println(
            when (isBalanced) {
                true -> "yes"
                false -> "no"
            }
        )
    }
}