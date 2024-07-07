import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (start, end, stream) = readLine().split(" ")
    val s = hashSetOf<String>()
    val e = hashSetOf<String>()
    var str: String?
    var result = 0
    while (true) {
        str = readLine()
        if (str.isNullOrEmpty()) break

        val (time, name) = str.split(" ")
        if (start >= time) {
            s += name
        } else if (time in end .. stream) {
            e += name
        }
    }
    for (name in e) {
        if (s.contains(name)) result++
    }

    bw.write("$result")
    bw.flush()
    bw.close()
}