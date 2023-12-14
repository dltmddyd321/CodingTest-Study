class Solution {
    fun solution(n: Int): Int {
        return n.toString().map {
            it.toInt() - 48
        }.sum()
    }
}