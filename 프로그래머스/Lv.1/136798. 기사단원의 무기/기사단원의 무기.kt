class Solution {
    // fun solution(number: Int, limit: Int, power: Int) = (1..number)
    //     .map {
    //         (1..it).count { each -> it % each == 0 } //약수의 개수를 구한다.
    //     }.sumOf {
    //         if (it > limit) power else it
    //     }
//         val temp = mutableListOf<Int>()
//         val res = mutableListOf<Int>()

//         fun countDivisors(number: Int): Int {
//             var count = 0

//             for (i in 1..number) {
//                 if (number % i == 0) {
//                     count++
//                 }
//             }

//             return count
//         }

//         fun sumOfDivisors(number: Int): Int {
//             var sum = 0

//             for (i in 1..number) {
//                 if (number % i == 0) {
//                     sum += i
//                 }
//             }

//             return sum
//         }

//         repeat(number) { temp.add(countDivisors(it + 1)) }

//         temp.forEachIndexed { index, i ->
//             if (i > limit) res.add(index + 1)
//         }

//         var result = 0
//         res.forEach {
//             result += sumOfDivisors(it)
//         }

//         return if (res.isEmpty()) {
//             temp.sum()
//         } else result
    fun solution(number: Int, limit: Int, power: Int): Int = (1..number).map { it -> measure(it).let { if ( it > limit) power else it }}.sum()

    fun measure(a:Int):Int {
        var sqrt = Math.sqrt(a.toDouble()).toInt()
        var result = (1..sqrt).count { a % it == 0 } * 2
        return if (sqrt * sqrt == a) result - 1 else result
    }
}