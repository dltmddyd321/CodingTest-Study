class Solution {
    fun solution(storey: Int): Int {
        var temp = storey
        var cnt = 0

        while (temp > 0) {
            //제일 작은 자릿 수부터 계산하도록 10으로 나눈다.
            var remain = temp % 10
            //temp 값은 작은 자릿 수를 빼야하니 10으로 나눈 몫으로 변경한다.
            temp /= 10

            when {
                remain > 5 -> { //반올림 처리
                    temp ++
                    cnt += 10 - remain
                }
                remain == 5 -> { //끝자리가 5일 수도 있고, 0일 수도 있다.
                    if (temp % 10 >= 5) {
                        temp ++
                        cnt += 10 - remain
                    } else {
                        cnt += remain
                    }
                }
                else -> {
                    cnt += remain
                }
            }
        }
        return cnt
    }
}