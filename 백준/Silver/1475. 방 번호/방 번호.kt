fun main() {
    val n = readln()
    val count = IntArray(10)

    for (ch in n) {
        val num = ch.digitToInt()
        count[num]++
    }

    val sixNineCount = count[6] + count[9]
    count[6] = sixNineCount / 2 + sixNineCount % 2
    count[9] = 0

    println(count.maxOrNull() ?: 0)
}