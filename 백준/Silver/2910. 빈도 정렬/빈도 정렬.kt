import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

data class Message(
    val key: Int,
    var index: Int,
    var count: Int
)

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val counts = br.readLine()
    val inputs = br.readLine().split(" ").map { it.toInt() }
    val temps = mutableListOf<Message>()

    inputs.forEachIndexed { index, input ->
        val exist = temps.find { it.key == input } //같은 키 찾기
        if (exist == null) {
            temps.add(Message(input, index, 1))
        } else {
            temps.remove(exist)
            temps.add(Message(input, exist.index, exist.count + 1))
        }
    }
    val sortedTemps = temps.sortedWith(
        compareByDescending<Message> { it.count }
            .thenBy { it.index }
    )
    val result = StringBuilder()
    sortedTemps.forEach { value ->
        repeat(value.count) {
            result.append("${value.key} ")
        }
    }
    println(result.toString())
}