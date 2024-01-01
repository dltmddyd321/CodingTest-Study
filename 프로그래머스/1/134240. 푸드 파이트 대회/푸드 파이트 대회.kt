class Solution {
    fun solution(food: IntArray): String {
    //    var size = 1
    //    for ((index, i) in food.withIndex()) {
    //        if (index == 0) continue
    //        size += if (i % 2 == 0) {
    //            i
    //        } else {
    //            i - 1
    //        }
    //    }
    //    val result = arrayOfNulls<Int>(size).toMutableList()
    //    result.add(size / 2, 0)
        val foodCnt = food.slice(1 until food.size).map { it / 2 }
        val individualFood = mutableListOf<Int>()
        for (i in foodCnt.indices) {
            for (j in 0 until foodCnt[i]) {
                if (foodCnt[i] != 0) {
                    individualFood.add(i + 1)
                }
            }
        }
        return individualFood.joinToString("") + "0" + individualFood.reversed().joinToString("")
    }
}