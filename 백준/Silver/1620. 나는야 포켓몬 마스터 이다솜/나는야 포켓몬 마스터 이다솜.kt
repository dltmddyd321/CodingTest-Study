import java.util.*
import kotlin.collections.ArrayList
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (cntData, cntQuestion) = br.readLine().split(" ").map { it.toInt() }
    val numberKeys = mutableMapOf<Int, String>()
    val nameKeys = mutableMapOf<String, Int>()

    repeat(cntData) {
        val name = br.readLine()
        numberKeys[it + 1] = name
        nameKeys[name] = it + 1
    }

    repeat(cntQuestion) {
        val input = br.readLine()

        if (input[0].isDigit()) {
            bw.write("${numberKeys[input.toInt()]}\n")
        } else {
            bw.write("${nameKeys[input]}\n")
        }
    }
    bw.flush()
    bw.close()
}