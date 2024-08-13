class Solution {
    fun solution(number: String, k: Int): String {
        val result = CharArray(number.length - k)
        var top = 0
        var count = k

        for (i in number.indices) {
            val char = number[i]
            // 스택의 마지막 요소가 현재 숫자보다 작고, 아직 제거할 수 있는 횟수가 남았다면 제거
            while (top > 0 && result[top - 1] < char && count > 0) {
                top--
                count--
            }
            // 결과 배열의 크기가 다 차지 않았다면 현재 숫자를 결과에 추가
            if (top < result.size) {
                result[top++] = char
            }
        }

        return String(result)
    }
}