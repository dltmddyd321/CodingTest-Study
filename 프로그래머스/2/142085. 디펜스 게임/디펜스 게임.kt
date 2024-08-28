import java.util.*
import java.util.LinkedList
import java.util.regex.Pattern
import kotlin.collections.ArrayDeque

class Solution {
    fun solution(n: Int, k: Int, enemy: IntArray): Int {
        var soldiers = n
        var items = k
        //라운드별로 병사를 통해 막은 적의 수를 저장하는 큐
        val heap = PriorityQueue<Int>(compareByDescending { it })

        for (i in enemy.indices) {
            val target = enemy[i]
            if (soldiers >= target) { //적의 데미지만큼 차감
                soldiers -= target
                heap.offer(target)
            } else {
                if (items > 0) {
                    if (heap.isNotEmpty() && heap.peek()!! > target) {
                        soldiers += heap.poll()!! - target
                        heap.offer(target)
                    }
                    items --
                } else {
                    return i
                }
            }
        }
        return enemy.size
    }
}