class Solution {
    fun solution(s: String): Int {
//         var checkingString = s
//         val charHashMap = hashMapOf<Char, Int>()
//         fun checkSameCountMap(): Boolean {
//             val uniqueValues = HashSet<Int>()
//             for (value in charHashMap.values) {
//                 if (!uniqueValues.add(value)) {
//                     return true
//                 }
//             }
//             return false
//         }
//         var cut = 0
//         var answer = 0

//         fun calString() {
//             checkingString.forEachIndexed { index, c ->
//                 val legacy = charHashMap[c] ?: 0
//                 charHashMap[c] = legacy + 1
//                 if (checkSameCountMap()) {
//                     cut = index
//                     answer ++
//                     return@forEachIndexed
//                 }
//             }
//             checkingString = checkingString.removeRange(0, cut)
//         }

//         while (checkingString.length > 1) {
//             calString()
//         }
//         return answer - 1
        var answer = 0
        var char = ' '
        var cnt = 0
        for (c in s) {
            when(char) {
                ' ', c -> {
                    cnt ++
                    char = c
                }
                else -> {
                    cnt --
                }
            }
            if (cnt == 0) {
                answer ++
                char = ' '
            }
        }
        if (cnt > 0) answer ++
        return answer
    }
}