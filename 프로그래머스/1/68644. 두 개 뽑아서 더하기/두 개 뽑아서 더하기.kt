class Solution {
    fun solution(numbers: IntArray): IntArray {
        val answer = mutableSetOf<Int>()

        //서로 다른 인덱스의 값을 조회하여 합산
        for (i in 0 until numbers.size - 1) {
            for (j in i + 1 until numbers.size) {
                answer.add(numbers[i] + numbers[j])
            }
        }
        //오름차순 정렬
        return answer.sorted().toIntArray()
    }
}