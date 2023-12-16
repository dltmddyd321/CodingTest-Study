import kotlin.math.max

class Solution {
    fun solution(sizes: Array<IntArray>): Int {
//         val areas = mutableListOf<Int>()
//         val widths = mutableListOf<Int>()
//         val heights = mutableListOf<Int>()

//         sizes.forEach {
//             areas.add(it[0] * it[1])
//             widths.add(it[0])
//             heights.add(it[1])
//         }
//         val maxWidth = widths.maxOf { it }
//         val maxAreas = areas.maxOf { it }
//         heights.sortDescending()
//         var res = 0

//         heights.forEach {
//             val temp = maxWidth * it
//             if (temp > maxAreas) res = temp
//             else return@forEach
//         }
//         return res
        var max = ArrayList<Int>()
        var min = ArrayList<Int>()

        for (i in sizes) {
            if (i[0] >= i[1]) {
                max.add(i[0])
                min.add(i[1])
            } else {
                max.add(i[1])
                min.add(i[0])
            }
        }
        return max.maxOrNull()!! * min.maxOrNull()!!
    }
}