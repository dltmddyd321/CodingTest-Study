class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        val arr = mutableMapOf<String, Int>()

        clothes.forEach {
            arr[it[1]] = (arr[it[1]] ?: 1) + 1
        }
        return arr.values.fold(1) { acc, i ->
            acc * i
        } - 1
    }
}