import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public static class Location {
        int x;
        int y;

        public Location(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    public int[] solution(int m, int n, int[][] picture) {
        
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        boolean[][] visited = new boolean[m][n];
        Queue<Location> queue = new LinkedList<>();
        int numberOfArea = 0;
        int maxSizeOfArea = 0;

        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {

                if (picture[i][j] == 0 || visited[i][j])
                    continue;

                numberOfArea++;
                int findingNumber = picture[i][j];
                visited[i][j] = true;
                queue.add(new Location(i, j));
                int size = 1;
                while(!queue.isEmpty()) {

                    Location location = queue.poll();
                    for(int k=0; k<dx.length; k++) {
                        int nX = location.x + dx[k];
                        int nY = location.y + dy[k];

                        if (nX<0 || nX>=m || nY<0 || nY>=n)
                            continue;

                        if (picture[nX][nY] == findingNumber && !visited[nX][nY]) {
                            visited[nX][nY] = true;
                            queue.add(new Location(nX, nY));
                            size++;
                        }
                    }
                }

                maxSizeOfArea = Math.max(maxSizeOfArea, size);
            }
        }

        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfArea;

        return answer;
    }
}