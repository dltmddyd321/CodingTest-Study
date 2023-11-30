class Solution {
    fun solution(n: Long): Long {
        return String("$n".toCharArray().sortedArrayDescending()).toLong()
    }
}