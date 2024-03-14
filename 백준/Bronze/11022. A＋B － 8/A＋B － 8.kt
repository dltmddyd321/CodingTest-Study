import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue
import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val size = readln().toInt()
    val res = mutableListOf<String>()
    repeat(size) { index ->
        val (n, k) = readln().split(" ").map { it.toInt() }
        res.add("Case #${index + 1}: $n + $k = ${n + k}")
    }
    res.forEach { println(it) }
}