fun main() {
    // 입력
    val n = readLine()!!.toInt()
    val arrayA = readLine()!!.split(" ").map { it.toInt() }.sorted() // 정렬된 배열
    val m = readLine()!!.toInt()
    val arrayB = readLine()!!.split(" ").map { it.toInt() }

    // 이분 탐색 함수
    fun binarySearch(array: List<Int>, target: Int): Boolean {
        var low = 0
        var high = array.size - 1

        while (low <= high) {
            val mid = (low + high) / 2
            when {
                array[mid] == target -> return true // 찾았음
                array[mid] < target -> low = mid + 1 // 오른쪽 탐색
                else -> high = mid - 1 // 왼쪽 탐색
            }
        }
        return false // 없음
    }

    // 배열 B의 각 원소에 대해 A에서 탐색
    val result = arrayB.map { if (binarySearch(arrayA, it)) 1 else 0 }

    // 출력
    result.forEach { println(it) }
}