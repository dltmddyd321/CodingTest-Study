class Solution {
    fun solution(s: String, n: Int): String {
        return s.toCharArray().map {
            when(it) {
                //마지막 알파벳 범위를 넘어가면 마지막 인덱스 만큼 역으로 차감한다.
                in 'A'..'Z' -> {
                    if (it + n > 'Z') it + n - 26 else it + n
                }
                in 'a'..'z' -> {
                    if (it + n > 'z') it + n - 26 else it + n
                }
                else -> { it }
            }
        //공백없이 문자열 연결
        }.joinToString("")
    }
}