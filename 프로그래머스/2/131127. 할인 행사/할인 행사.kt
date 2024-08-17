class Solution {
    fun solution(want: Array<String>, number: IntArray, discount: Array<String>): Int {
        val wantMap = want.indices.associate { want[it] to number[it] }.toMutableMap()
        val currentMap = mutableMapOf<String, Int>()
        var res = 0

        // 초기 10일간의 할인 상품을 맵에 넣기
        for (i in 0 until 10) {
            currentMap[discount[i]] = currentMap.getOrDefault(discount[i], 0) + 1
        }

        // 첫 10일간의 할인 상품과 원하는 상품을 비교
        if (currentMap == wantMap) res++

        // 슬라이딩 윈도우로 남은 할인 상품 검사
        for (i in 10 until discount.size) {
            // 새로운 상품 추가
            currentMap[discount[i]] = currentMap.getOrDefault(discount[i], 0) + 1
            // 윈도우에서 벗어난 상품 제거
            val prevItem = discount[i - 10]
            if (currentMap[prevItem] == 1) {
                currentMap.remove(prevItem)
            } else {
                currentMap[prevItem] = currentMap[prevItem]!! - 1
            }

            // 현재 윈도우와 원하는 상품 비교
            if (currentMap == wantMap) res++
        }

        return res
    }
}