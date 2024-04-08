import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val N = br.readLine().toInt()
    val arr = mutableListOf<Int>()
    for (i in 0 until N) {
        arr.add(br.readLine().toInt())
    }
    arr.sortDescending()
    var ans: Long = 0
    for (i in 0 until N) {
        // 팁이 0원이 될 경우 반복문을 종료.
        if (arr[i] - i <= 0) {
            break
        }
        ans += (arr[i] - i).toLong()
    }
    bw.write(ans.toString() + "\n")
    bw.flush()
    bw.close()
    br.close()
}