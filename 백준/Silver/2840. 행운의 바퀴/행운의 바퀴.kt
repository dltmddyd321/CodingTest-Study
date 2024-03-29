import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Arrays
import java.util.LinkedList
import java.util.Queue
import java.util.Scanner
import java.util.Stack
import java.util.StringTokenizer
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val nm = Arrays.stream(br.readLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }
        .toTypedArray()).mapToInt { s: String -> s.toInt() }.toArray()
    val n = nm[0]
    val k = nm[1]

    val wheel = CharArray(n) // 바퀴

    Arrays.fill(wheel, '?')
    var arrow = 0 // 화살표

    val discover = BooleanArray('Z'.code - 'A'.code + 1)
    var possible = true

    for (i in 0 until k) {
        val st = StringTokenizer(br.readLine())
        val rot = st.nextToken().toInt()
        val alpha = st.nextToken()[0]
        arrow = (arrow + rot) % n
        if (wheel[arrow] != '?' && wheel[arrow] != alpha || wheel[arrow] != alpha && discover[alpha.code - 'A'.code]) {
            possible = false
            break
        }
        wheel[arrow] = alpha
        discover[alpha.code - 'A'.code] = true
    }

    if (possible) {
        val answer = java.lang.StringBuilder()
        var t: Int
        for (i in 0 until n) {
            t = arrow - i
            if (t < 0) t += n
            answer.append(wheel[t])
        }
        print(answer)
    } else {
        print('!')
    }
}