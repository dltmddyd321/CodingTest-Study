import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue
import java.util.Scanner
import java.util.Stack
import java.util.StringTokenizer


fun main() = with(Scanner(System.`in`)) {
    val n = readln()
    val list = mutableListOf<Int>()
    readln().split(" ").map { it.toInt() }.forEach {
        list.add(it)
    }
    val find = readln().toInt()
    println(list.count { it == find })
}