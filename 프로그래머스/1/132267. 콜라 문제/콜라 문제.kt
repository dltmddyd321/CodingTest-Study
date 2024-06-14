class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var temp = n
        var res = 0

        while (temp / a > 0) {
            val mok = temp / a
            val service = mok * b
            temp = temp - (mok * a) + service
            res += service
        }

        return res
    }
}