import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    bw.write("${factorial(br.readLine().toLong(), 1)}")
    bw.flush()
    bw.close()
}

fun factorial(n: Long, acc: Long): Long {
    return if (n <= 1) acc
    else factorial(n - 1, n * acc)
}