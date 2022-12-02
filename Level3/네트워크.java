import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;

        boolean[] visited = new boolean[n];

        for (int i=0; i<n; i++) {

            if (visited[i])
                continue;

            Queue<Integer> queue = new LinkedList<>();
            visited[i] = true;
            queue.add(i);
            while(!queue.isEmpty()) {
                int now = queue.poll();
                for (int j=0; j<n; j++) {
                    if (!visited[j] && computers[now][j] == 1) {
                        visited[j] = true;
                        queue.add(j);
                    }
                }
            }

            answer++;
        }
        return answer;
    }
}