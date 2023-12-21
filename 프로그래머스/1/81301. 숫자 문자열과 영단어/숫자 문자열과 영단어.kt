class Solution {
    fun solution(s: String): Int {
        var s = s
        val numArr = arrayOf(
            "zero",
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine"
        )
        for (i in numArr.indices) {
            //해당하는 인덱스에 맞추어 변경한다.
            s = s.replace(numArr[i], i.toString())
        }
        return s.toInt()
    }
}