class Solution {
    fun solution(n: Int): String {
        var res = ""
        repeat(n) {
            res += if (it % 2 == 0) {
                "수"
            } else {
                "박"
            }
        }
        return res
    }
}