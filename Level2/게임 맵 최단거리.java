import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    
    static class Location {
        int x;
        int y;
        
        public Location(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    // 상 하 좌 우
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    
    public int solution(int[][] maps) {
        int answer = 0;
        int n = maps.length;
        int m = maps[0].length;
        boolean[][] visited = new boolean[n][m];
        int[][] distance = new int[n][m];
        Queue<Location> queue = new LinkedList<>();
        
        visited[0][0] = true;
        distance[0][0] = 1;
        queue.add(new Location(0, 0));
        while(!queue.isEmpty()) {
            
            Location location = queue.poll();
            for(int i=0; i<4; i++) {
                int nX = location.x + dx[i];
                int nY = location.y + dy[i];
                
                if (nX<0 || nX>=n || nY<0 || nY>=m)
                    continue;
                
                if (!visited[nX][nY] && maps[nX][nY] != 0) {
                    visited[nX][nY] = true;
                    distance[nX][nY] = distance[location.x][location.y] + 1;
                    queue.add(new Location(nX, nY));
                }
            }
        }
        
        answer = distance[n-1][m-1];
        
        if (answer == 0)
            answer = -1;
        
        return answer;
    }
}