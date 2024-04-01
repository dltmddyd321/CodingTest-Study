import java.io.*
import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val k = readLine().toInt()
    val stack = arrayListOf<Int>()

    for (i in 0 until k) {
        val temp = readLine().toInt()
        if (temp == 0) stack.removeAt(stack.size - 1)
        else stack.add(temp)
    }
    println(stack.sum())
}