import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int n = progresses.length;
        int[] daysToComplete = new int[n];

        for (int i = 0; i < n; i++) {
            int remainingProgress = 100 - progresses[i];
            daysToComplete[i] = (remainingProgress % speeds[i] == 0) ? (remainingProgress / speeds[i]) : (remainingProgress / speeds[i] + 1);
        }

        List<Integer> result = new ArrayList<>();
        int maxDays = daysToComplete[0];
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (daysToComplete[i] <= maxDays) {
                count++;
            } else {
                result.add(count);
                maxDays = daysToComplete[i];
                count = 1;
            }
        }
        result.add(count);

        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }

        return resultArray;
    }
}