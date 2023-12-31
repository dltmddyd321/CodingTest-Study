class Solution {
    fun solution(answers: IntArray): IntArray {
        val userAnswers = arrayOf(
            intArrayOf(1, 2, 3, 4, 5),
            intArrayOf(2, 1, 2, 3, 2, 4, 2, 5),
            intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
        )
        val correctCnt = intArrayOf(0, 0, 0)
        val res = mutableListOf<Int>()

        for ((index, value) in answers.withIndex()) {
            if (value == userAnswers[0][index % userAnswers[0].size]) {
                correctCnt[0] += 1
            }
            if (value == userAnswers[1][index % userAnswers[1].size]) {
                correctCnt[1] += 1
            }
            if (value == userAnswers[2][index % userAnswers[2].size]) {
                correctCnt[2] += 1
            }
        }

        for ((idx, score) in correctCnt.withIndex()){
            if (score == correctCnt.maxOrNull()){
                res.add(idx + 1)
            }
        }
        return res.toIntArray()
    }
}