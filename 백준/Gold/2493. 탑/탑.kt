import java.util.Stack

fun main() {
    val n = readLine()!!.toInt() // 탑의 수
    val heights = readLine()!!.split(" ").map { it.toInt() } // 탑들의 높이
    val result = IntArray(n) // 결과를 저장할 배열
    val stack = Stack<Pair<Int, Int>>() // (탑의 인덱스, 탑의 높이)를 저장하는 스택

    for (i in heights.indices) {
        while (stack.isNotEmpty() && stack.peek().second <= heights[i]) {
            stack.pop() // 현재 탑보다 작은 탑들은 무시
        }
        
        if (stack.isNotEmpty()) {
            result[i] = stack.peek().first + 1 // 수신하는 탑의 인덱스를 저장 (1-based index)
        } else {
            result[i] = 0 // 수신하는 탑이 없으면 0을 저장
        }

        stack.push(Pair(i, heights[i])) // 현재 탑을 스택에 추가
    }

    println(result.joinToString(" ")) // 결과 출력
}