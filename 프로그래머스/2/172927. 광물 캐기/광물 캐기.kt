import java.util.Arrays
import java.util.Calendar
import java.util.Collections
import java.util.LinkedList
import java.util.Locale
import java.util.PriorityQueue
import java.util.Queue
import java.util.Scanner
import java.util.Stack
import java.util.StringTokenizer
import java.util.regex.Pattern
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min
import kotlin.math.roundToInt
import kotlin.math.sqrt

class Solution {
fun solution(picks: IntArray, minerals: Array<String>): Int {
    var answer = 0

    //마인이 작업을 끝내기까지 필요한 최소한의 피로도를 return
    val cnt = min((minerals.size / 5 + 1).toDouble(), (picks[0] + picks[1] + picks[2]).toDouble())
        .toInt()
    val section = Array(cnt) { IntArray(3) } //5개씩 묶었을 때 광물별 피로도 계산
    var dp = 0
    var ip = 0
    var sp = 0

    //곡괭이 개수만큼만 세기 -> 어차피 곡괭이 수가 부족하면 뒤에 있는 광물은 못 캠.
    run {
        var i = 0
        while (i < minerals.size) {
            if (i / 5 == cnt) {
                break
            }
            for (j in i until i + 5) {
                val m = minerals[j]
                when (m) {
                    "diamond" -> {
                        dp += 1
                        ip += 5
                        sp += 25
                    }
                    "iron" -> {
                        dp += 1
                        ip += 1
                        sp += 5
                    }
                    else -> {
                        dp += 1
                        ip += 1
                        sp += 1
                    }
                }

                if (j == minerals.size - 1) {
                    break
                }
            }

            section[i / 5][0] = dp
            section[i / 5][1] = ip
            section[i / 5][2] = sp

            sp = 0
            ip = sp
            dp = ip
            i += 5
        }
    }


    //돌로 캤을 때 피로도가 가장 높은 순으로 내림차순 정렬
    Arrays.sort(
        section
    ) { o1: IntArray, o2: IntArray ->
        (o2[2] - o1[2])
    }


    //다이아 -> 철 -> 돌 순서대로 캐기
    for (i in 0 until cnt) {
        if (picks[0] != 0) {
            answer += section[i][0] //다이아로 캤을 때 피로도
            picks[0]--
        } else if (picks[1] != 0) {
            answer += section[i][1]
            picks[1]--
        } else if (picks[2] != 0) {
            answer += section[i][2]
            picks[2]--
        }
    }

    return answer
    }
}