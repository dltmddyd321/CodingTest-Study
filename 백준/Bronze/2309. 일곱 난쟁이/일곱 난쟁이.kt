import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue
import java.util.Scanner
import java.util.StringTokenizer

fun main() = with(Scanner(System.`in`)) {
    val list = mutableListOf<Int>()
    repeat(9) { list.add(nextInt()) }

    val selected = mutableListOf<Int>()
    val sum = list.sum()
    for (i in 0 until list.size) {
        for (j in i + 1 until list.size) {
            if (sum - (list[i] + list[j]) == 100) {
                list.forEach {
                    if (it != list[i] && list[j] != it) {
                        selected.add(it)
                    }
                }
                selected.sorted().forEach {
                    println(it)
                }
                return@with
            }
        }
    }
}