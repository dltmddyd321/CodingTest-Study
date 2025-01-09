fun main() {
    val n = readLine()!!.toInt() // 데이터 세트의 수를 입력받음
    val results = mutableListOf<String>()

    repeat(n) {
        val (x, y) = readLine()!!.split(" ").map { it.toInt() }
        if (x >= y) {
            results.add("MMM BRAINS")
        } else {
            results.add("NO BRAINS")
        }
    }

    results.forEach { println(it) }
}