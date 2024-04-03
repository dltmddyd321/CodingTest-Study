import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Arrays
import java.util.Deque
import java.util.LinkedList
import java.util.Queue
import java.util.Scanner
import java.util.Stack
import java.util.StringTokenizer
import kotlin.math.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val N = br.readLine().toInt()
    val arr = IntArray(N)
    val sorted_arr = IntArray(N)
    val deque: Deque<Int> = LinkedList()
    val st = StringTokenizer(br.readLine())
    for (i in 0 until N) {
        arr[i] = st.nextToken().toInt()
        sorted_arr[i] = arr[i]
    }
    val K = br.readLine().toInt()
    var sort_max = 0 // 어디까지 정렬할 건지
    for (i in 0 until K) {
        val str = br.readLine()
        val A = str.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[0].toInt()
        val B = str.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[1].toInt()
        sort_max =
            max(sort_max.toDouble(), max(A.toDouble(), B.toDouble())).toInt()
        while (!deque.isEmpty() && abs(deque.last.toDouble()) <= A) {
            deque.pollLast()
        }
        deque.addLast(A)
        while (!deque.isEmpty() && abs(deque.last.toDouble()) <= B) {
            deque.pollLast()
        }
        deque.addLast(-B)
    }
    deque.addLast(0) // 마지막 연산 위해
    Arrays.sort(arr, 0, sort_max) // arr 정렬하기
    var final_idx = sort_max - 1
    var ascend_idx = sort_max - 1
    var descend_idx = 0
    var cur = deque.pollFirst()
    while (!deque.isEmpty()) {
        val next = deque.pollFirst()
        val diff = (abs(cur.toDouble()) - abs(next.toDouble())).toInt()
        if (cur > 0) {  // 오름차순
            for (i in 0 until diff) {
                sorted_arr[final_idx--] = arr[ascend_idx--]
            }
        } else {    // 내림차순
            for (i in 0 until diff) {
                sorted_arr[final_idx--] = arr[descend_idx++]
            }
        }
        cur = next
    }
    for (i in sorted_arr.indices) {
        bw.write(sorted_arr[i].toString() + " ")
    }
    br.close()
    bw.flush()
    bw.close()
}