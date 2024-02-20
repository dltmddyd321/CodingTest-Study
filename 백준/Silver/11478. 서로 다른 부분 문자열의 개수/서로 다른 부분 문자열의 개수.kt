import java.util.*
import kotlin.collections.ArrayList
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(Scanner(System.`in`)) {
    val input = next()
    fun getSubstrings(s: String): List<String> {
        val substrings = mutableListOf<String>()
        val n = s.length
        for (i in 0 until n) {
            for (j in i + 1..n) {
                substrings.add(s.substring(i, j))
            }
        }
        return substrings
    }
    println(getSubstrings(input).distinct().size)
}