fun main() {
    // 입력 받기
    val n = readLine()!!.toInt()
    val arr = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    val x = readLine()!!.toInt()

    // 배열을 정렬
    arr.sort()

    var left = 0
    var right = n - 1
    var count = 0

    // 투 포인터로 두 수의 합이 x인 쌍 찾기
    while (left < right) {
        val sum = arr[left] + arr[right]

        if (sum == x) {
            count++
            left++
            right--
        } else if (sum < x) {
            left++ // 합이 x보다 작으면 왼쪽 포인터 이동
        } else {
            right-- // 합이 x보다 크면 오른쪽 포인터 이동
        }
    }

    // 결과 출력
    println(count)
}