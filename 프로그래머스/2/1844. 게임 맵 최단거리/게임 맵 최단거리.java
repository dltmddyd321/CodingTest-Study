import java.util.LinkedList;
import java.util.Queue;

class Position {
    int x, y, distance;

    Position(int x, int y, int distance) {
        this.x = x;
        this.y = y;
        this.distance = distance;
    }
}

class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        boolean[][] visited = new boolean[n][m];
        
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        
        Queue<Position> queue = new LinkedList<>();
        queue.offer(new Position(0, 0, 1)); // 시작 지점 (0, 0)에서 시작, 초기 거리는 1
        visited[0][0] = true;
        
        while (!queue.isEmpty()) {
            Position current = queue.poll();
            int x = current.x;
            int y = current.y;
            int distance = current.distance;
            
            // 목표 지점에 도달한 경우
            if (x == n - 1 && y == m - 1) {
                return distance;
            }
            
            // 4방향 탐색
            for (int[] dir : directions) {
                int nx = x + dir[0];
                int ny = y + dir[1];
                
                if (nx >= 0 && ny >= 0 && nx < n && ny < m && !visited[nx][ny] && maps[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    queue.offer(new Position(nx, ny, distance + 1));
                }
            }
        }
        
        // 목표 지점에 도달할 수 없는 경우
        return -1;
    }
}