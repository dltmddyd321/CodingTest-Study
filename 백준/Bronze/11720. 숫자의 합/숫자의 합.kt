import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue
import java.util.Scanner
import java.util.Stack
import java.util.StringTokenizer

fun main() = with(Scanner(System.`in`)) {
    val n = readln()
    var res = 0
    readln().map { it.toString().toInt() }.toIntArray().forEach {
        res += it
    }
    println(res)
}