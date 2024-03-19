import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue
import java.util.Scanner

fun main() {
    val word = readln().toString()
    val map = mutableMapOf<Char, Int>()

    word.forEach {
        val character = it.lowercaseChar()

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
        print(max.key.uppercaseChar())
    }
}