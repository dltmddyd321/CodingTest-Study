import java.util.Stack

class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        val daysToComplete = progresses.mapIndexed { index, progress ->
            val remainingProgress = 100 - progress
            if (remainingProgress % speeds[index] == 0) {
                remainingProgress / speeds[index]
            } else {
                remainingProgress / speeds[index] + 1
            }
        }

        val result = mutableListOf<Int>()
        var maxDays = daysToComplete[0]
        var count = 1

        for (i in 1 until daysToComplete.size) {
            if (daysToComplete[i] <= maxDays) {
                count++
            } else {
                result.add(count)
                maxDays = daysToComplete[i]
                count = 1
            }
        }
        result.add(count)

        return result.toIntArray()
    }
}