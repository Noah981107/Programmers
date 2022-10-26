import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int value : scoville)
            pq.offer(value);
        
        boolean isAllOver = false;
        while (!isAllOver) {
            
            if (pq.size() == 1) {
                if (pq.peek() < K) {
                    answer = -1;
                    break;
                }
            }
            
            int root = pq.peek();
            if (root < K) {
                int first = pq.poll();
                int second = pq.poll();
                pq.offer(first + (second * 2));
                answer++;
            }
            else
                isAllOver = true;
            
        }
        
        return answer;
    }
}