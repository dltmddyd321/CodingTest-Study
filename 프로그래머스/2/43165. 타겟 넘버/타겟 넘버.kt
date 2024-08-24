class Solution {
    fun solution(numbers: IntArray, target: Int): Int {
        var answer = 0

        fun dfs(index: Int, currentSum: Int) {
            // 모든 숫자를 사용한 경우
            if (index == numbers.size) {
                if (currentSum == target) {
                    answer++
                }
                return
            }

            // 다음 숫자를 더한 경우
            dfs(index + 1, currentSum + numbers[index])
            // 다음 숫자를 뺀 경우
            dfs(index + 1, currentSum - numbers[index])
        }

        // 초기 호출: 0번째 인덱스, 현재 합 0으로 시작
        dfs(0, 0)

        return answer
    }
}