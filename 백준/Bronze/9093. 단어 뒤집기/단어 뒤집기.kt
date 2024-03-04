import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue
import java.util.Scanner
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    repeat(readLine().toInt()) {
        readLine().split(" ").map { it.reversed() }.forEach {
            print("$it ")
        }
        println()
    }
}