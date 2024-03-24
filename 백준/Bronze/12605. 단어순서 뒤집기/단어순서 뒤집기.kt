import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue
import java.util.Scanner

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    for (i in 0 until n) {
        val str = br.readLine()
        val strArr = str.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        print("Case #" + (i + 1) + ": ")
        for (j in strArr.indices.reversed()) {
            print(strArr[j] + " ")
        }
        println()
    }
}