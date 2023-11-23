class Solution {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
//         val callingPointsMap = callings.groupBy { it }.mapValues { it.value.size }
//         val playersPos = players.indices.associateBy { players[it] }.toMutableMap()

//         callingPointsMap.forEach {
//             //이동 대상의 기존 인덱스를 먼저 구한다.
//             val initPos = playersPos[it.key] ?: 0
// https://small-stepping.tistory.com/m/232#            val changedPos = initPos - it.value

//             val temp = players[changedPos]
//             players[changedPos] = it.key
//             players[initPos] = temp
//         }
//         return players
        
        val rankMap : HashMap<String, Int> = hashMapOf()

        //원래 플레이어들의 위치 값을 정리한다.
        for (i in players.indices) {
            rankMap[players[i]] = i
        }

        for (i in callings) {
            //계산 중인 배열에서 기존 위치 값 가져온다.
            val callRank = rankMap[i]

            //기존 위치 값 - 1 플레이어 찾는다.
            val front = players[callRank!! - 1]

            //두 개를 변경한다. 
            players[callRank - 1] = i
            players[callRank] = front

            //이후 반복에서 사용할 rankMap에서도 변경한다.
            rankMap[i] = callRank - 1
            rankMap[front] = callRank
        }
        return players
    }
}