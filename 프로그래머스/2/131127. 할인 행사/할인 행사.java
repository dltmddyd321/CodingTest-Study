import java.util.HashMap;
import java.util.Map;


class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        Map<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        Map<String, Integer> currentMap = new HashMap<>();
        int res = 0;

        for (int i = 0; i < 10; i++) {
            currentMap.put(discount[i], currentMap.getOrDefault(discount[i], 0) + 1);
        }

        if (currentMap.equals(wantMap)) res++;

        for (int i = 10; i < discount.length; i++) {
            currentMap.put(discount[i], currentMap.getOrDefault(discount[i], 0) + 1);

            String prevItem = discount[i - 10];
            if (currentMap.get(prevItem) == 1) {
                currentMap.remove(prevItem);
            } else {
                currentMap.put(prevItem, currentMap.get(prevItem) - 1);
            }

            if (currentMap.equals(wantMap)) res++;
        }

        return res;
    }
}