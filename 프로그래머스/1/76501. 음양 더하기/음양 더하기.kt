class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        val temp = mutableListOf<Int>()
        signs.forEachIndexed { index, value ->
            if (!value) temp.add(-absolutes[index])
            else temp.add(absolutes[index])
        }
       return temp.sum()
    }
}