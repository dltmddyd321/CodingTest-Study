import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue
import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val n = readln().toInt()
    val pArr = readln().split("\\*".toRegex()).dropLastWhile { it.isEmpty() }
        .toTypedArray()
    val left = pArr[0]
    val right = pArr[1]
    val res = mutableListOf<String>()
    repeat(n) {
        val input = readln()
        if (input.length < left.length + right.length) {
            res.add("NE")
        } else {
            val front = input.substring(left.indices)
            val back = input.substring(input.length - right.length, input.length)
            if (front == left && back == right) {
                res.add("DA")
            } else {
                res.add("NE")
            }
        }
    }
    res.forEach {
        println(it)
    }
}