import java.util.Stack

class Solution {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        var res = 0
        val stack = Stack<Int>()

        val newBoard = mutableListOf<MutableList<Int>>()
        board.forEach { newBoard.add(it.toMutableList()) }

        fun getLines(index: Int): List<Int> {
            return newBoard.map { it[index] }
        }

        moves.forEach {
            val lines = getLines(it - 1)
            val target = lines.firstOrNull { num -> num != 0 } ?: 0
            if (target != 0) {
                val pos = lines.indexOfFirst { value -> value == target }
                newBoard[pos][it - 1] = 0
                if (stack.isNotEmpty() && stack.peek() == target) {
                    stack.pop()
                    res += 2
                } else {
                    stack.push(target)
                }
            }
        }
        return res
    }
}