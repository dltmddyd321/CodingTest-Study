import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.text.SimpleDateFormat
import java.time.OffsetDateTime
import java.time.ZoneId
import java.util.*
import java.util.regex.Pattern
import kotlin.collections.ArrayDeque
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.roundToInt
import kotlin.math.sqrt


class Solution {
    fun solution(operations: Array<String>): IntArray {
        val answer = intArrayOf(0, 0)
        val maxQue = PriorityQueue<Int>(Collections.reverseOrder())
        val minQue = PriorityQueue<Int>()

        for(input in operations) {
            val op: List<String> = input.split(" ")
            when(op[0]) {
                "I" -> {
                    val num: Int = Integer.parseInt(op[1])
                    maxQue.offer(num)
                    minQue.offer(num)
                }
                "D" -> {
                    if (maxQue.isEmpty()) continue
                    when(op[1]) {
                        "1" -> {
                            val max = maxQue.poll()
                            minQue.remove(max)
                        }
                        "-1" -> {
                            val min = minQue.poll()
                            maxQue.remove(min)
                        }
                    }
                }
            }
        }
        if(!maxQue.isEmpty() && !minQue.isEmpty()) {
            answer[0] = maxQue.poll()!!
            answer[1] = minQue.poll()!!
        }
        return answer
    }
}