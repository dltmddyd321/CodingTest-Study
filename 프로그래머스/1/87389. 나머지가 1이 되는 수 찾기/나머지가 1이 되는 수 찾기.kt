class Solution {
    fun solution(n: Int): Int {
        for(x in 2 until n-1){
            if(n%x==1) return x
        }
        return n-1
    }
}