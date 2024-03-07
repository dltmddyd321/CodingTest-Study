import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue
import java.util.Scanner
import java.util.Stack
import java.util.StringTokenizer

fun main() {
    val stringBuilder = StringBuilder()

    val (number, sequenceNumber) = readln().split(" ").map { it.toInt() }
    val numberQueue = LinkedList(Array(number) { it + 1 }.toList())

    var index: Int = -1
    while (numberQueue.isNotEmpty()) {
        index = (index + sequenceNumber) % numberQueue.size
        stringBuilder.append(numberQueue.removeAt(index--)).append(", ")
    }

    with(stringBuilder) {
        // 맨 끝의 콤마, 공백을 삭제함
        this.deleteCharAt(this.length - 1)
        this.deleteCharAt(this.length - 1)
        this.insert(0, '<')
        this.insert(this.length, '>')
    }

    println(stringBuilder.toString())
}