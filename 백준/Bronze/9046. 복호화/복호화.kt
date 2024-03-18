import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue
import java.util.Scanner
import java.util.Stack
import java.util.StringTokenizer

fun main() = with(Scanner(System.`in`)) {
    val list = mutableListOf<String>()
    val n = readln().toInt()
    repeat(n) { list.add(readln()) }
    list.forEach { str ->
        val frequencies =
            str.replace(" ","").map { value -> value.toString() }.groupingBy { char -> char }.eachCount()
        val maxFrequency = frequencies.maxBy { it.value }.value
        val mostFrequentElements = frequencies.filter { it.value == maxFrequency }.keys
        val result = if (mostFrequentElements.size > 1) "?" else mostFrequentElements.first()
        println(result)
    }
}