class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var min = 0
        var max = 0
        val res = mutableListOf<Int>()
        val winNumbers = win_nums.toMutableList()

        fun check(value: Int): Int {
            return when (value) {
                6 -> 1
                5 -> 2
                4 -> 3
                3 -> 4
                2 -> 5
                else -> 6
            }
        }

        if (lottos.all { it != 0 }) { //0이 하나도 없을 경우, 교집합 개수를 반환
            min = lottos.intersect(winNumbers.toSet()).size
            repeat(2) { res.add(check(min)) }
            return res.toIntArray()
        }

        val intersection = lottos.intersect(winNumbers.toSet())
        min = intersection.size //0이 하나 있으면 무조건 1 더해준다.

        winNumbers.removeIf { it in lottos }
        val diff = winNumbers.size //아직 선택 가능한 정답 개수
        val zeroCnt = lottos.count { it == 0 }

        max = if (zeroCnt > diff) { //0의 공백을 정답으로 채우기 부족할 때,
            intersection.size + diff
        } else { //공백 개수랑 가능한 정답 개수가 동일할 경우 또는 공백 개수가 정답 개수보다 적을 경우
            intersection.size + zeroCnt
        }

        res.add(check(max))
        res.add(check(min))

        return res.toIntArray()
    }
}