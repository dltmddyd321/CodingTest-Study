import java.lang.IllegalArgumentException
import java.lang.Integer.min
import java.lang.StringBuilder
import java.util.Scanner
import java.util.Stack
import kotlin.math.abs

class Solution {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        val answer = IntArray(targets.size) { -1 } // -1로 모두 초기화

        val map = mutableMapOf<Char, Int>()

        keymap.forEach { str ->
            val arr = str.toCharArray()
            arr.forEach {
                if (map.containsKey(it)) {
                    //키가 포함된 가장 가까운 위치 값 저장
                    map[it] = min(map[it]!!, arr.indexOf(it) + 1)
                } else {
                    map[it] = arr.indexOf(it) + 1
                }
            }
        }

        for (i in targets.indices) {
            val arr = targets[i].toCharArray()
            var count = 0
            var flag = true
            for (j in arr.indices) {
                //포함되어 있다면 계산
                if (map.containsKey(arr[j])) {
                    count += map[arr[j]]!!
                } else {
                    flag = false
                    break
                }
            }
            if (flag) answer[i] = count
        }
        return answer
    }
}