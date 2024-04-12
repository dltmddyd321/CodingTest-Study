class Solution {
    fun solution(new_id: String): String {
        var answer = new_id

        val reg1 = Regex("[a-z0-9-_.]")
        val reg2 = Regex("[.]{2,}")

        // 1단계
        answer = answer.lowercase()
        val temp = StringBuilder()

        // 2단계
        for (e in answer) {
            if (reg1.containsMatchIn(e.toString())) {
                temp.append(e)
            }
        }

        // 3단계
        answer = temp.toString().replace(reg2, ".")

        // 4단계
        if (answer.isNotEmpty() && answer.first() == '.') answer = answer.removeRange(0, 1)
        if (answer.isNotEmpty() && answer.last() == '.') answer = answer.removeRange(answer.length-1, answer.length)

        // 5단계
        if (answer.isEmpty()) answer = "a"

        // 6단계
        if (answer.length >= 16) {
            answer = answer.slice(0..14)
        }

        // 6단계 : 4단계 과정을 한번 더 해주는 이유는 위 과정을 거치고 마지막 문자가 .인 경우 제거해주기 위함.
        if (answer.isNotEmpty() && answer.first() == '.') answer = answer.removeRange(0, 1)
        if (answer.isNotEmpty() && answer.last() == '.') answer = answer.removeRange(answer.length-1, answer.length)

        // 7단계
        while (answer.length <= 2) {
            answer += answer[answer.length - 1]
        }
        return answer
    }

}