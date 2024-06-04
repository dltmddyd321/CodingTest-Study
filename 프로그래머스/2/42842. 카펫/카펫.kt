class Solution {
//     fun solution(brown: Int, yellow: Int): IntArray {
//         fun findPairsForProduct(n: Int): List<Pair<Int, Int>> {
//             val pairs = mutableListOf<Pair<Int, Int>>()

//             for (i in 1..n) {
//                 if (n % i == 0) {
//                     if (i >= 3 && (n / i) >= 3) {
//                         pairs.add(Pair(i, n / i))
//                     }
//                 }
//             }

//             return pairs
//         }
//         val list = findPairsForProduct(brown + yellow)
//         val res = list.find { it.first >= it.second && it.first >= 3} ?: return intArrayOf()

//         return intArrayOf(res.first, res.second)
//     }
    
    fun solution(brown: Int, yellow: Int): IntArray {
        // yellow의 세로의 길이를 1부터 yellow까지 반복
        return (1..yellow)
            // yellow가 세로로 나누어 떨어지면서 해당 세로의 길이로 brown의 넓이를 게산 한 값이 brown과 같을경우
            .first{ (yellow % it == 0) && ((yellow / it + it) * 2 + 4 == brown)}
            // 가로와 세로를 계산하여 반환
            .let{ intArrayOf(yellow / it + 2, it + 2) }
    }
}