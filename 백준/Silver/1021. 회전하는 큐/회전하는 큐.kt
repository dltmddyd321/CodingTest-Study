import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, m) = br.readLine()!!.split(" ").map { it.toInt() }
    val choice = br.readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    val q = LinkedList<Int>()
    for (i in 1..n) q.add(i)
    var res = 0
    var count = 0
    while (count != m) {
        if (q.first == choice[count]) {
            q.poll()
        } 
        else {
            for (i in 1 until q.size) {
                if (q[q.size - i] == choice[count]) {
                    while (q[0] != choice[count]) {
                        q.add(0, q.last)
                        q.removeLast()
                        res++
                    }
                    q.poll()
                    break
                } else if (q[i] == choice[count]) {
                    while (q[0] != choice[count]) {
                        q.add(q.first)
                        q.removeFirst()
                        res++
                    }
                    q.poll()
                    break
                }
            }
        }
        count++
    }
    println(res)
}
