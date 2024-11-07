import java.util.*;
import java.io.*;

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var st: StringTokenizer
    val result = java.lang.StringBuilder()
    val T = br.readLine().toInt() //테스트케이스 수

    for (t in 0 until T) {
        st = StringTokenizer(br.readLine())
        val N = st.nextToken().toInt()
        val M = st.nextToken().toInt()

        val A = arrayOfNulls<Int>(N)
        val B = arrayOfNulls<Int>(M)

        st = StringTokenizer(br.readLine())
        for (i in 0 until N) {
            A[i] = st.nextToken().toInt()
        }

        st = StringTokenizer(br.readLine())
        for (i in 0 until M) {
            B[i] = st.nextToken().toInt()
        }

        Arrays.sort(A, Collections.reverseOrder())
        Arrays.sort(B, Collections.reverseOrder())
        var temp = 0
        for (i in 0 until N) {
            var cnt = 0
            for (j in 0 until M) {
                if (A[i]!! > B[j]!!) {
                    temp += (M - cnt)
                    break
                } else cnt++
            }
        }
        result.append(temp.toString() + "\n")
    }

    bw.write(result.toString() + "")
    bw.flush()
    bw.close()
}