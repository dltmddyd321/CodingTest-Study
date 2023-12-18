class Solution {
    fun solution(num: Int): Int {
        var num = num
        var answer = 0
        while (num != 1 && answer != 500) {
            if (num % 2 == 0) {
                num /= 2
            } else if (num % 2 == 1) {
                num = num * 3 + 1
            }
            answer++
        }
        if (answer == 500) {
            answer = -1
        }
        return answer
    }
}