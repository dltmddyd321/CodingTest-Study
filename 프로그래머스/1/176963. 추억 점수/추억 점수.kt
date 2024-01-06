class Solution {
    fun solution(name: Array<String>, yearning: IntArray, photoes: Array<Array<String>>): IntArray {
        val map = name.zip(yearning.toTypedArray()).toMap()
        return photoes.map { photo -> photo.sumOf { map[it] ?: 0 } }.toIntArray()
    }
}