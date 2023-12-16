class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        val ones = cards1.toMutableList()
        val seconds = cards2.toMutableList()
        val temp = mutableListOf<String>()
        for (w in goal) {
            if (ones.isNotEmpty() && w == ones.firstOrNull()) {
                ones.removeFirst()
                temp.add(w)
                continue
            } 
            if (seconds.isNotEmpty() && w == seconds.firstOrNull()) {
                seconds.removeFirst()
                temp.add(w)
                continue
            }
            return "No"
        }
        return if (temp.joinToString() == goal.joinToString()) "Yes" else "No"
    }
}