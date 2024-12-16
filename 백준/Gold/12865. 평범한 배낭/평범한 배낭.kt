fun main() {
    val (N, K) = readln().split(" ").map { it.toInt() } // 물품 수 N, 배낭의 최대 무게 K
    val items = mutableListOf<Pair<Int, Int>>() // (무게, 가치) 쌍

    for (i in 1..N) {
        val (W, V) = readln().split(" ").map { it.toInt() }
        items.add(Pair(W, V))
    }

    // DP 테이블 선언: 최대 무게 K까지 처리할 수 있도록
    val dp = Array(N + 1) { IntArray(K + 1) }

    // DP 점화식 적용
    for (i in 1..N) {
        val (weight, value) = items[i - 1]
        for (w in 0..K) {
            if (w >= weight) {
                // i번째 물건을 넣을 수 있는 경우
                dp[i][w] = maxOf(dp[i - 1][w], dp[i - 1][w - weight] + value)
            } else {
                // i번째 물건을 넣을 수 없는 경우
                dp[i][w] = dp[i - 1][w]
            }
        }
    }

    // 최대 가치 출력
    println(dp[N][K])
}