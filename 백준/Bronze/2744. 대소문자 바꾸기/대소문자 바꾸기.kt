import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.ArrayList

fun main() = with(Scanner(System.`in`)) {
    val n = readln()
    val stringBuilder = StringBuilder()
    n.forEach {
        val check = if (it.isUpperCase()) it.lowercase() else it.uppercase()
        stringBuilder.append(check)
    }
    println(stringBuilder.toString())
}