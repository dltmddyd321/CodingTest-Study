import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Arrays
import java.util.LinkedList
import java.util.Queue
import java.util.Scanner
import java.util.Stack
import java.util.StringTokenizer
import java.util.TreeMap

val br = System.`in`.bufferedReader()
fun main() = with(System.out.bufferedWriter()) {
    val map = TreeMap<String, Double>()
    var size = 0
    while (true) {
        val input = br.readLine() ?: break
        map[input] = map.getOrDefault(input, 0.0) + 1
        size++
    }
    map.forEach {
        write("${it.key} ${String.format("%.4f", it.value / size * 100)}\n")
    }
    close()
}