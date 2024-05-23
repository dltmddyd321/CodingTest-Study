import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.abs

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())
    val W = st.nextToken().toInt()
    val H = st.nextToken().toInt()
    st = StringTokenizer(br.readLine())
    val q = st.nextToken().toInt() //q가 컬럼
    val p = st.nextToken().toInt() //p가 로우
    val t = br.readLine().toInt()
    var x = (q + t) % (2 * W)
    var y = (p + t) % (2 * H)
    x = (W - abs((W - x).toDouble())).toInt()
    y = (H - abs((H - y).toDouble())).toInt()
    println("$x $y")
}