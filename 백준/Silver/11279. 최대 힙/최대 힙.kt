import java.util.PriorityQueue

fun main() {
    val n = readLine()!!.toInt() // 연산의 개수
    val maxHeap = PriorityQueue<Int>(compareByDescending { it }) // 최대 힙

    repeat(n) {
        val x = readLine()!!.toInt()
        if (x == 0) {
            // 힙이 비어있다면 0 출력
            if (maxHeap.isEmpty()) {
                println(0)
            } else {
                // 가장 큰 값 출력 후 제거
                println(maxHeap.poll())
            }
        } else {
            // x 값을 힙에 추가
            maxHeap.add(x)
        }
    }
}