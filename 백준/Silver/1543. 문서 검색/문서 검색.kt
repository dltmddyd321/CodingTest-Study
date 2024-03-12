import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val scanner = Scanner(System.`in`)
    val firstStr = scanner.nextLine()
    val secondStr = scanner.nextLine()
    var index = 0
    var answer = 0
    while (index + secondStr.length <= firstStr.length) {
        if (firstStr.substring(index, index + secondStr.length) == secondStr) {
            answer++
            index += secondStr.length
        } else {
            index++
        }
    }
    println(answer)
}