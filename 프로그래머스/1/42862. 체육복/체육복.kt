class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var answer = n
        // set을 사용하여 여벌옷이 있는 사람을 제외하고 추가
        val lostSet = lost.sorted().toSet() - reserve.toSet()
        // set을 사용하여 잃어버린 사람을 제외하고 추가
        val reserveSet = (reserve.toSet() - lost.toSet()) as MutableSet

        for(l in lostSet){
            when{
                // 이전 사람이 여벌옷이 있는 경우
                l - 1 in reserveSet -> reserveSet.remove(l - 1)
                // 앞 사람이 여벌옷이 있는 경우
                l + 1 in reserveSet -> reserveSet.remove(l + 1)
                // 체육복을 구하지 못한경우 answer 감소
                else -> answer--
            }
        }

        return answer
    }
}