import java.io.*
import java.lang.StringBuilder
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st1 = StringTokenizer(br.readLine())
    val n = st1.nextToken().toInt()
    val lim = st1.nextToken().toInt()
    val arr = Array(12) {0}
    var result = 0
    for(i in 0 until n){
        val st2 = StringTokenizer(br.readLine())
        val a = st2.nextToken().toInt()
        val b = st2.nextToken().toInt()

        when (b) {
            1 -> {
                when (a) {
                    0 -> arr[0] += 1
                    1 -> arr[1] += 1
                }
            }
            2 -> {
                when (a) {
                    0 -> arr[2] += 1
                    1 -> arr[3] += 1
                }
            }
            3 -> {
                when (a) {
                    0 -> arr[4] += 1
                    1 -> arr[5] += 1
                }
            }
            4 -> {
                when (a) {
                    0 -> arr[6] += 1
                    1 -> arr[7] += 1
                }
            }
            5 -> {
                when (a) {
                    0 -> arr[8] += 1
                    1 -> arr[9] += 1
                }
            }
            6 -> {
                when (a) {
                    0 -> arr[10] += 1
                    1 -> arr[11] += 1
                }
            }
        }
    }
    for(a in arr){
        result += if(a%lim > 0 )
            (1+a/lim)
        else a/lim
    }
    println(result)
}
