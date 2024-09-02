fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val dnaList = Array(n) { readLine()!! }
    
    val consensus = StringBuilder()
    var hammingDistanceSum = 0

    // 각 위치에서 가장 많이 나타나는 문자를 찾기
    for (i in 0 until m) {
        val count = mutableMapOf<Char, Int>()
        for (dna in dnaList) {
            val char = dna[i]
            count[char] = count.getOrDefault(char, 0) + 1
        }
        
        // 가장 많이 나타나는 문자를 선택 (동률일 경우 사전순)
        val mostFrequentChar = count.maxWithOrNull(compareBy({ it.value }, { -it.key.code }))!!.key
        consensus.append(mostFrequentChar)
        
        // Hamming Distance 계산
        for (dna in dnaList) {
            if (dna[i] != mostFrequentChar) {
                hammingDistanceSum++
            }
        }
    }

    println(consensus.toString())
    println(hammingDistanceSum)
}