import java.util.*
import kotlin.collections.ArrayList
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(Scanner(System.`in`)) {
    var input = nextInt()
    var cnt = 0
    while (true) {
        if (input % 5 == 0) {
            println(cnt + input / 5)
            return@with
        } else if (input < 0){
            println("-1")
            return@with
        }
        cnt ++
        input -= 3
    }
}