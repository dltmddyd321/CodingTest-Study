import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st1 = br.readLine()
    val st2 = br.readLine()
    val arr = Array('z' - 'a' + 1) { 0 }
    var result = 0
    for (s in st1) {
        arr[(s - 'a')] += 1
    }
    for (s in st2) {
        arr[(s - 'a')] -= 1
    }
    for (i in arr) {
        result += if (i < 0) (-1) * i else i
    }
    print(result)
}