class Solution {
    fun solution(s: String): String {
        val splitString = s.split(' ')
        var answer = arrayOf<String>()

        splitString.forEach { s ->
            var string = ""
            s.forEachIndexed { index, c ->
                string += when (index % 2) {
                    0 -> c.uppercaseChar()
                    else -> c.lowercaseChar()
                }
            }
            answer += string
        }

        //배열 요소를 공백으로 구분하여 String으로 합친다.
        return answer.joinToString(' '.toString())
    }
}