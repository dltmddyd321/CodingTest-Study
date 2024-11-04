import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = br.readLine().split(" ").map { it.toInt() }

    val passwordMap = mutableMapOf<String, String>()

    repeat(n) {
        val (site, password) = br.readLine().split(" ")
        passwordMap[site] = password
    }

    repeat(m) {
        val querySite = br.readLine()
        bw.write("${passwordMap[querySite]}\n")
    }

    bw.flush()
    bw.close()
}