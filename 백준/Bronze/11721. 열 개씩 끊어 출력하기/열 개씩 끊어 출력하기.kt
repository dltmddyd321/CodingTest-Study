import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue
import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val result = readln().chunked(10)
    result.forEach { println(it) }
}