import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue
import java.util.Scanner

fun main() {
    fun isCpp(str: String): Boolean = str.contains("_")
    var first = true
    val input = readlnOrNull() ?: ""
    var ans = ""

    // 첫 번째 글자가 _나 대문자로 시작하는 경우 또는 마지막 글자가 _로 끝나는 경우
    if (input.isEmpty() || !input[0].isLowerCase() || input.last() == '_') {
        println("Error!")
        return
    }

    if (isCpp(input)) {
        val tokens = input.split('_')
        for (word in tokens) {
            if (word.isEmpty()) {
                println("Error!")
                return
            }
            var w = word
            if (w[0].isLowerCase()) {
                if (!first) {
                    w =
                        w.replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }
                } else {
                    first = false
                }
                ans += w
            } else {
                println("Error!")
                return
            }
            for (i in 1 until w.length) {
                if (w[i].isUpperCase()) {
                    println("Error!")
                    return
                }
            }
        }
    } else {
        var buf = ""
        for (e in input) {
            if (e.isUpperCase()) {
                ans += buf
                ans += '_'
                buf = ""
                buf += e.lowercase()
            } else {
                buf += e
            }
        }
        ans += buf
    }

    println(ans)
}