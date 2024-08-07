import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // 전체 사람의 수
        int a = scanner.nextInt(); // 첫 번째 사람 번호
        int b = scanner.nextInt(); // 두 번째 사람 번호
        int m = scanner.nextInt(); // 관계의 수

        // 그래프를 인접 리스트로 표현
        List<List<Integer>> relations = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            relations.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int parent = scanner.nextInt();
            int child = scanner.nextInt();
            // 양방향 그래프
            relations.get(parent).add(child);
            relations.get(child).add(parent);
        }

        int result = calculateChonSu(n, a, b, relations);
        System.out.println(result);
    }

    public static int calculateChonSu(int n, int start, int target, List<List<Integer>> relations) {
        boolean[] visited = new boolean[n + 1];
        Queue<int[]> queue = new LinkedList<>(); // 큐에는 {현재 사람, 현재 촌수} 저장

        queue.offer(new int[]{start, 0});
        visited[start] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentPerson = current[0];
            int currentChonSu = current[1];

            if (currentPerson == target) {
                return currentChonSu;
            }

            for (int relative : relations.get(currentPerson)) {
                if (!visited[relative]) {
                    visited[relative] = true;
                    queue.offer(new int[]{relative, currentChonSu + 1});
                }
            }
        }

        // 목표인 target에 도달하지 못하면 -1 반환
        return -1;
    }
}