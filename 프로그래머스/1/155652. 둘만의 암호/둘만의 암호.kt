class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        val texts = ('a'..'z').filter { it !in skip } //제외 대상 문자열 정리
        return s.map { texts[(texts.indexOf(it) + index) % texts.size] }.joinToString("")
    }
}