class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var curM = section[0] //현재 롤러의 시작 지점 위치
        var answer = 1 //롤러가 움직인 횟수

        for (i in section.indices) {
            //칠해야 할 구역이 
            //현재 롤러가 움직인 범위 내에 있는 경우:
            if (section[i] <= curM + m - 1) continue
            //현재 롤러가 움직인 범위 밖에 있는 경우:
            else {
                //롤러의 시작 지점을 칠해야 할 구역으로 움직이고
                curM = section[i]
                //칠하기
                answer++
            }
        }
        return answer
    }
}