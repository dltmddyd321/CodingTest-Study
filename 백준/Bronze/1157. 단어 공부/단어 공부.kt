import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val word = readln()
    val map = mutableMapOf<String, Int>()

    word.forEach {
        val character = it.lowercase()

        if (map.containsKey(character)) {
            map[character] = map[character]!!.plus(1)
        } else {
            map[character] = 1
        }
    }

    val max = map.maxBy { it.value }
    if (map.filter { it.value == max.value }.count() > 1) {
        print("?")
    } else {
        print(max.key.uppercase())
    }
}