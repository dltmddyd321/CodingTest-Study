import java.util.*
import kotlin.collections.ArrayList
import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readln().toInt()
    val cardSet = readln().split(" ").map { it.toInt() }.toMutableSet()
    val m = readln().toInt()

    readln().split(" ").map { it.toInt() }.forEach {
        if (!cardSet.add(it)) print("1 ") else print("0 ")
    }
}