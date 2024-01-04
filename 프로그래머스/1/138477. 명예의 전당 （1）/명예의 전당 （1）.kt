class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        val answer = IntArray(score.size)
        val kList = IntArray(k)
        for (i in score.indices) {
            if (i < k) {
                kList[i] = score[i]
                kList.sortDescending()
                answer[i] = kList[i]
            } else {
                if (kList[k - 1] < score[i]) kList[k - 1] = score[i]
                kList.sortDescending()
                answer[i] = kList[k - 1]
            }
        }
        return answer
    }
}