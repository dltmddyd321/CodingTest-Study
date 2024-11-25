fun main() {
    // 입력
    val (nA, nB) = readLine()!!.split(" ").map { it.toInt() }
    val setA = readLine()!!.split(" ").map { it.toInt() }
    val setB = readLine()!!.split(" ").map { it.toInt() }.sorted() // 집합 B 정렬

    // 이분 탐색 함수
    fun binarySearch(array: List<Int>, target: Int): Boolean {
        var low = 0
        var high = array.size - 1

        while (low <= high) {
            val mid = (low + high) / 2
            when {
                array[mid] == target -> return true // 존재
                array[mid] < target -> low = mid + 1 // 오른쪽 탐색
                else -> high = mid - 1 // 왼쪽 탐색
            }
        }
        return false // 존재하지 않음
    }

    // 결과를 저장할 리스트
    val result = setA.filter { !binarySearch(setB, it) }.sorted()

    // 출력
    if (result.isEmpty()) {
        println(0)
    } else {
        println(result.size)
        println(result.joinToString(" "))
    }
}