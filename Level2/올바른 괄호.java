import java.util.Stack;

class Solution {
    boolean solution(String s) {
                boolean answer = true;

        Stack stack = new Stack();
        
        if(s.charAt(0) == ')') {
            return false;
        }

        for(int i=0; i<s.length(); i++) {
            char element = s.charAt(i);

            if(!stack.isEmpty() && element == ')')
                stack.pop();
            else
                stack.push(element);
        }
        
        if (stack.isEmpty())
            answer = true;
        else
            answer = false;

        return answer;
    }
}