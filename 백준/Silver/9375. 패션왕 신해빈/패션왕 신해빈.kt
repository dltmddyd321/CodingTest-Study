import java.io.*
import java.util.Arrays
import java.util.Deque
import java.util.LinkedList
import java.util.Queue
import java.util.Scanner
import java.util.Stack
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var tc = readLine().toInt()
    while (tc-- > 0) {
        val input = readLine().toInt()
        val mp = HashMap<String, Int>()
        for (i in 0 until input) {
            val a = readLine().split(" ")[1]
            if (mp.containsKey(a)) mp[a] = 1 + mp[a]!!
            else mp[a] = 1
        }
        var ans = 1
        for (a in mp.values) ans *= (a + 1)
        println(ans - 1)
    }
}