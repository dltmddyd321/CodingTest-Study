import java.util.*
import kotlin.collections.ArrayList
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(Scanner(System.`in`)) {
    val first = nextInt()
    val second = nextInt()

    val firstList = mutableListOf<String>()
    val secondList = mutableListOf<String>()

    repeat(first) { firstList.add(next()) }

    repeat(second) { secondList.add(next()) }

    val intersection = firstList.intersect(secondList.toSet()).sorted()
    println(intersection.size)
    intersection.forEach { println(it) }
}