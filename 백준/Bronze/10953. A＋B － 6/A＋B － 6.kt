import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue
import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val size = readln().toInt()
    val res = mutableListOf<Int>()
    repeat(size) {
        val (n, k) = readln().split(",").map { it.toInt() }
        res.add(n + k)
    }
    res.forEach { println(it) }
}
