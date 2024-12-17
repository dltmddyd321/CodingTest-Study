import java.util.PriorityQueue
import kotlin.math.abs

fun main() {
    val n = readln().toInt() // 연산의 개수
    val priorityQueue = PriorityQueue { a: Int, b: Int -> // 우선순위 큐
        if (abs(a) == abs(b)) a - b // 절댓값이 같다면 실제 값 기준 오름차순
        else abs(a) - abs(b) // 절댓값 기준 오름차순
    }

    repeat(n) {
        when (val x = readln().toInt()) {
            0 -> { // 큐에서 절댓값이 가장 작은 값 출력 및 제거
                if (priorityQueue.isEmpty()) {
                    println(0)
                } else {
                    priorityQueue.poll()?.let { value -> println(value) } // 가장 우선순위가 높은 값 반환 및 제거
                }
            }
            else -> priorityQueue.offer(x) // 값 추가
        }
    }
}