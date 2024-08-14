import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        for (int i = 0; i < targets.length; i++) {
            answer[i] = -1; // -1로 모두 초기화
        }

        Map<Character, Integer> map = new HashMap<>();

        for (String str : keymap) {
            char[] arr = str.toCharArray();
            for (char c : arr) {
                int index = str.indexOf(c) + 1;
                if (map.containsKey(c)) {
                    // 키가 포함된 가장 가까운 위치 값 저장
                    map.put(c, Math.min(map.get(c), index));
                } else {
                    map.put(c, index);
                }
            }
        }

        for (int i = 0; i < targets.length; i++) {
            char[] arr = targets[i].toCharArray();
            int count = 0;
            boolean flag = true;
            for (char c : arr) {
                // 포함되어 있다면 계산
                if (map.containsKey(c)) {
                    count += map.get(c);
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) answer[i] = count;
        }

        return answer;
    }
}