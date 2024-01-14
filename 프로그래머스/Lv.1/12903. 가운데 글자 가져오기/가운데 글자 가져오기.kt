class Solution {
    fun solution(s: String): String {
        return if (s.length % 2 == 0) {
            //절반 나눈 값 -1 ~ 절반 나눈 값 +1
            s.substring(s.length / 2 - 1, s.length / 2 + 1)
        } else {
            //절반 인덱스 ~ 절반 + 1 인덱스 추출
            s.substring(s.length / 2, s.length / 2 + 1)
        }
    }
}