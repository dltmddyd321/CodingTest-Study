import java.util.LinkedList
import java.util.Queue

class Solution {
    data class Position(
        val x: Int,
        val y: Int,
        val cnt: Int
    )

    fun solution(board: Array<String>): Int {
        val n = board.size
        val m = board[0].length
        val directions = arrayOf(Pair(0, 1), Pair(1, 0), Pair(0, -1), Pair(-1, 0))
        val visited = Array(n) { BooleanArray(m) { false } }

        var startX = 0
        var startY = 0

        for (i in 0 until n) {
            for (j in 0 until m) {
                if (board[i][j] == 'R') {
                    startX = i
                    startY = j
                    break
                }
            }
        }
        visited[startX][startY] = true

        val queue: Queue<Position> = LinkedList()
        queue.offer(Position(startX, startY, 0))

        while (queue.isNotEmpty()) {
            val (x, y, moves) = queue.poll()!!

            // 목표 지점(G)에 도달한 경우
            if (board[x][y] == 'G') return moves

            for (dir in directions) {
                var nx = x
                var ny = y

                // 현재 방향으로 계속 이동
                while (true) {
                    val nextX = nx + dir.first
                    val nextY = ny + dir.second

                    // 경계를 벗어나거나 장애물에 부딪히면 멈춤
                    if (nextX !in 0 until n || nextY !in 0 until m || board[nextX][nextY] == 'D') break

                    nx = nextX
                    ny = nextY
                }

                // 새 위치가 방문되지 않은 곳이라면
                if (!visited[nx][ny]) {
                    visited[nx][ny] = true
                    queue.offer(Position(nx, ny, moves + 1))
                }
            }
        }

        // 목표 지점에 도달할 수 없는 경우
        return -1
    }
}