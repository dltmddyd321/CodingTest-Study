import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())
    val line = st.nextToken()
    val length = line.length
    var R = 0
    for (i in 1 until length) {
        if (length % i == 0) {
            val quotient = length / i
            if (i > quotient) break
            R = i
        }
    }
    val C = length / R
    val arr = Array(R) { CharArray(C) }
    var cnt = 0
    for (i in 0 until C) {
        for (j in 0 until R) {
            arr[j][i] = line[cnt++]
        }
    }
    for (i in 0 until R) {
        for (j in 0 until C) {
            print(arr[i][j])
        }
    }
    println()
}
