class Solution {
    fun solution(arr: IntArray): IntArray = if (arr.size == 1) intArrayOf(-1)
        //가장 작은 수와 다른 값들은 모두 필터링
        else arr.filter {  it != arr.minOrNull() }.toIntArray()
}