import java.util.LinkedList
import java.util.Queue
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val st = StringTokenizer(readLine())
    val n = st.nextToken().toInt()
    val k = st.nextToken().toInt()
    val queue: Queue<Int> = LinkedList()
    val sb = StringBuffer("<")

    repeat(n) { queue.add(it + 1) }

    while (queue.isNotEmpty()) {
        for (i in 0 until k - 1) {
            //맨 앞의 원소를 맨 뒤로 보낸다.
            queue.offer(queue.poll())
        }
        
        //K번째 원소는 빼거나 마지막 하나 남았을 경우 잔여 처리한다. 
        if (queue.size == 1) sb.append("${queue.poll()}")
        else sb.append("${queue.poll()}, ")
    }
    println("$sb>")
}