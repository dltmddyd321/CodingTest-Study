class Solution {
    fun solution(a: Int, b: Int): String {
         val date = listOf("THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED")
         val month = listOf(0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
//0부터 a-1까지의 범위에서 각 월의 일수를 합산합니다. 
//reduce 함수는 누적된 값을 생성하는 데 사용됩니다. 각 월의 일수는 month 리스트에서 가져오며, 현재까지 누적된 값에 더해집니다.
         val sum = (0 until a).reduce { total, next -> total + month[next] } + b
         return date[sum % 7]
    }
}