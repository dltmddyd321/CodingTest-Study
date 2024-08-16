import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> rankMap = new HashMap<>();

        // 원래 플레이어들의 위치 값을 정리한다.
        for (int i = 0; i < players.length; i++) {
            rankMap.put(players[i], i);
        }

        for (String calling : callings) {
            // 계산 중인 배열에서 기존 위치 값 가져온다.
            int callRank = rankMap.get(calling);

            // 기존 위치 값 - 1 플레이어 찾는다.
            String front = players[callRank - 1];

            // 두 개를 변경한다.
            players[callRank - 1] = calling;
            players[callRank] = front;

            // 이후 반복에서 사용할 rankMap에서도 변경한다.
            rankMap.put(calling, callRank - 1);
            rankMap.put(front, callRank);
        }

        return players;
    }
}