import java.util.*
import kotlin.collections.ArrayList
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val n = br.readLine().toInt()

    val arr = IntArray(10001)
    for (i in 0 until n) {
        arr[br.readLine().toInt()]++
    }
    for (i in arr.indices) {
        bw.write("$i\n".repeat(arr[i]))
    }
    br.close()
    bw.close()
}