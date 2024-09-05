fun main() {
    val t = readLine()!!.toInt()  // 테스트케이스의 개수

    repeat(t) {
        val recordedSounds = readLine()!!.split(" ").toMutableList()
        val knownSounds = mutableSetOf<String>()

        while (true) {
            val line = readLine()!!
            if (line == "what does the fox say?") break
            val sound = line.split(" ")[2]  // <동물> goes <소리> 에서 <소리>를 추출
            knownSounds.add(sound)
        }

        // 여우의 소리만 남기기
        val foxSounds = recordedSounds.filter { it !in knownSounds }

        // 결과 출력
        println(foxSounds.joinToString(" "))
    }
}