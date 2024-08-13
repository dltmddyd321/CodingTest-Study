class Solution {
    public int solution(int storey) {
        int temp = storey;
        int cnt = 0;

        while (temp > 0) {
            int remain = temp % 10;  // 현재 처리할 나머지
            temp /= 10;  // 다음 자릿수로 이동

            if (remain > 5) {
                // 반올림 처리
                temp++;
                cnt += 10 - remain;
            } else if (remain == 5) {
                // 5는 다음 자릿수를 보고 반올림 또는 내림 처리
                if (temp % 10 >= 5) {
                    temp++;
                    cnt += 10 - remain;
                } else {
                    cnt += remain;
                }
            } else {
                // 5 미만인 경우 그대로 내림 처리
                cnt += remain;
            }
        }
        return cnt;
    }
}