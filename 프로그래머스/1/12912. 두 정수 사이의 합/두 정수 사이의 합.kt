import kotlin.math.*

class Solution {
    // fun solution(a: Int, b: Int): Long {
    //     var res = 0L
    //     val ma = max(a, b)
    //     val mi = min(a, b)
    //     for(i in mi..ma) {
    //         res += i
    //     }
    //     return res.toLong()
    // }
    //초기 값을 설정하여 시작부터 끝까지 더하는 fold() 함수 활용
    fun solution(a: Int, b: Int) =(min(a, b)..max(a, b)).fold(0L) { total, next -> total + next }.toLong()
}