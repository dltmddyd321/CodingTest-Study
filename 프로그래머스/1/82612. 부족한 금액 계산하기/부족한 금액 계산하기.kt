class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        // var temp = 0
        // repeat(count) {
        //     temp += price + price * it
        // }
        // return if (temp <= money) return 0 else (temp - money).toLong()
        return (1..count)
            .fold(0L) { acc, it -> acc + (price * it) }
            .let { if (money > it) 0L else it - money } 
    }
}