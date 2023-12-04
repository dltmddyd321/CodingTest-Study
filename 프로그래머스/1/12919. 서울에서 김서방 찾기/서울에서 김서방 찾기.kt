class Solution {
    fun solution(seoul: Array<String>): String {
        var res = ""
        seoul.forEachIndexed { index, s ->
            if (s == "Kim") {
                res = "김서방은 ${index}에 있다"
                return@forEachIndexed
            }  
        } 
        return res
    }
}