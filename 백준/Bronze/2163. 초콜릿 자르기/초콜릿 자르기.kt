import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue
import java.util.Scanner
import java.util.StringTokenizer

fun main() = with(Scanner(System.`in`)) {
    val (n, k) = readln().split(" ").map { it.toInt() }
    println(n * k - 1)
}