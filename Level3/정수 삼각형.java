class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        
        int N = triangle.length;
        
        int[][] dp = new int[N][N];
        for(int i=0; i<N; i++) {
            if (i == N-1) {
                for (int j=0; j<N; j++) {
                    dp[N-1][j] = triangle[N-1][j];
                }
            }
            else {
                for (int j=0; j<N; j++) {
                    dp[i][j] = -1;
                }    
            }
        }
        
        answer = solution2(0, 0, N, dp, triangle);
        
        return answer;
    }
    
    public int solution2(int level, int idx, int N, int[][] dp, int[][] triangle) {
        
        if (level == N-1)
            return dp[level][idx];
        
        if (dp[level][idx] == -1) {
            dp[level][idx] = Math.max(solution2(level + 1, idx, N, dp, triangle), solution2(level + 1, idx + 1, N, dp, triangle)) + triangle[level][idx];
        }
        
        return dp[level][idx];
    }
}