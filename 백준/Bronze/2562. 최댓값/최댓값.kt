import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Arrays
import java.util.LinkedList
import java.util.Queue
import java.util.Scanner
import java.util.Stack
import java.util.StringTokenizer
import kotlin.math.sqrt

fun main() = with(Scanner(System.`in`)) {
    val list = mutableListOf<Int>()
    var maxLine = 0
    var max = 0

    for (i in 0 until 9) {
        val input = nextInt()
        list.add(input)

        if (max < list[i]) {
            max = list[i]
            maxLine = i
        }
    }
    println("$max\n${maxLine + 1}")
}