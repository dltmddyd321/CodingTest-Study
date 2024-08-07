import java.util.LinkedList
import java.util.Queue

fun main() {
    val n = readLine()!!.toInt()
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    val m = readLine()!!.toInt()

    // 그래프를 표현할 인접 리스트
    val relations = Array(n + 1) { mutableListOf<Int>() }

    repeat(m) {
        val (parent, child) = readLine()!!.split(" ").map { it.toInt() }
        relations[parent].add(child)
        relations[child].add(parent)  // 무방향 그래프
    }

    // BFS를 통한 촌수 계산
    val result = calculateChonSu(n, a, b, relations)
    println(result)
}

fun calculateChonSu(n: Int, start: Int, target: Int, relations: Array<MutableList<Int>>): Int {
    val visited = BooleanArray(n + 1) { false }
    val queue: Queue<Pair<Int, Int>> = LinkedList()  // Pair(현재 사람, 현재 촌수)

    queue.offer(Pair(start, 0))
    visited[start] = true

    while (queue.isNotEmpty()) {
        val (currentPerson, currentChonSu) = queue.poll()

        if (currentPerson == target) {
            return currentChonSu
        }

        for (relative in relations[currentPerson]) {
            if (!visited[relative]) {
                visited[relative] = true
                queue.offer(Pair(relative, currentChonSu + 1))
            }
        }
    }

    // 목표인 target에 도달하지 못하면 -1 리턴
    return -1
}