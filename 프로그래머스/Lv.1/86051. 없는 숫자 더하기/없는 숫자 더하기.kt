class Solution {
    fun solution(numbers: IntArray): Int {
        var answer = 45
        for (num in numbers) {
            answer -= num
        }
        return answer
    }
}