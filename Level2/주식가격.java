import java.util.Stack;

class Solution {
    public int[] solution(int[] prices) {
  int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<prices.length; i++) {

            while(!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                int idx = stack.pop();

                answer[idx] = i - idx;
            }

            stack.push(i);
        }

        while(!stack.isEmpty()) {
            int foundIdx = stack.pop();
            answer[foundIdx] = prices.length - 1 - foundIdx;
        }

        return answer;
    }
}