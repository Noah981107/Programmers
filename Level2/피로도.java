import java.lang.Math;

class Solution {

    static int maxDungeonNum = 0;
    
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        
        solution2(k, 0, dungeons, visited);
        
        return maxDungeonNum;
    }
    
    public void solution2(int fatigue, int level, int[][] dungeons, boolean[] visited) {
        
        for(int i=0; i<dungeons.length; i++) {
            if (!visited[i] && fatigue >= dungeons[i][0]) {
                visited[i] = true;
                solution2(fatigue - dungeons[i][1], level + 1, dungeons, visited);
                visited[i] = false;
            }
        }
        maxDungeonNum = Math.max(maxDungeonNum, level);
    }
}