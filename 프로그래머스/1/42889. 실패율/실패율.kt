class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {
        var res = mutableMapOf<Int, Double>()
        var players = stages.size

        (1..N).forEach {
            val failPlayer = stages.count { stage -> it == stage }
            res[it - 1] =
                if (players != 0) {
                    failPlayer.toDouble() / players.toDouble()
                } else 0.0
            players -= failPlayer
        }

        return res.toList().sortedByDescending { it.second }.map { it.first + 1 }.toIntArray()

    //    repeat(N) { cnt ->
    //        val player = stages.count { it <= cnt + 1 }
    //        val value = (player.toDouble() / stages.filter { it >= cnt + 1 }.size.toDouble()) * 100
    //        res[cnt + 1] = value
    //    }
    //    println(res.values)
    }
}