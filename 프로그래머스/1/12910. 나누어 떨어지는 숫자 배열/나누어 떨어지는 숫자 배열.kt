class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var answer = intArrayOf()
        val temp = mutableListOf<Int>()

        for (i in arr.indices) {
            if (arr[i] % divisor == 0){
                temp.add(arr[i])
            } else continue
        }
        if (temp.size == 0) {
            temp.add(-1)
        }
        temp.sort()
        answer = temp.toIntArray()
        return answer
    }
}