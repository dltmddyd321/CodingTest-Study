fun main() {
    val n = readln().toInt()
    val arr = readln().split(" ").map { it.toInt() }.sorted()

    var left = 0
    var right = n - 1
    var closestSum = Int.MAX_VALUE // 0에 가장 가까운 합
    var answer = Pair(0, 0) // 결과로 반환할 두 값

    while (left < right) {
        val sum = arr[left] + arr[right]

        // 현재 합이 0에 더 가까우면 결과 갱신
        if (kotlin.math.abs(sum) < kotlin.math.abs(closestSum)) {
            closestSum = sum
            answer = Pair(arr[left], arr[right])
        }

        // 합에 따라 포인터 이동
        if (sum > 0) {
            right-- // 합이 양수면 큰 값을 줄이기 위해 오른쪽 포인터 이동
        } else if (sum < 0) {
            left++ // 합이 음수면 작은 값을 줄이기 위해 왼쪽 포인터 이동
        } else {
            break // 합이 정확히 0이면 종료
        }
    }

    println(closestSum)
}