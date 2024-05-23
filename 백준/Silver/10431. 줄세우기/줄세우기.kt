import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.abs
import kotlin.math.max

fun main() {
    val scanner = Scanner(System.`in`)
    val p = scanner.nextInt()
    val res = mutableMapOf<Int, Int>()

    repeat(p) {
        val t = scanner.nextInt()
        val arr = mutableListOf<Int>()
        repeat(20) {
            arr.add(scanner.nextInt())
        }

        var cnt = 0
        for (i in 0 until 20) {
            val slice = arr.slice(0 until i)
            cnt += slice.count { it > arr[i] }
        }
        res[t] = cnt
    }
    res.forEach { (t, u) ->
        println("$t $u")
    }
}