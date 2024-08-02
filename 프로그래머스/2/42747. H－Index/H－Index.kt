class Solution {
    fun solution(citations: IntArray): Int {
        val list = citations.sortedDescending()
        for (i in list.indices) {
            if (list[i] <= i) return i
        }
        return list.size
    }
}