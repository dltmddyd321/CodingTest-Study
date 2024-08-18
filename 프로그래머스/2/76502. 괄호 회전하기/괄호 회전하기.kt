import java.util.*
import java.util.LinkedList

class Solution {
    fun solution(s: String): Int {
        val openBracket = charArrayOf('(', '{', '[')
        val closeBracket = charArrayOf(')', '}', ']')
        var res = 0

        val queue: Queue<Char> = LinkedList()
        s.forEach { queue.add(it) }

        fun isSuccess(s: String): Boolean {
            val stack = Stack<Char>()
            var flag: Boolean
            for (c in closeBracket) if (c == s[0]) return false

            for (c in s) {
                flag = false
                for (i in openBracket.indices) {
                    if (stack.isNotEmpty() && stack.peek() == openBracket[i] && c == closeBracket[i]) flag = true
                }
                if (flag) stack.pop() else stack.add(c)
            }
            return stack.isEmpty()
        }

        repeat(s.length) {
            if (isSuccess(queue.joinToString(""))) res ++
            val last = queue.remove()
            queue.offer(last)
        }
        return res
    }
}