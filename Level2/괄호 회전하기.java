import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for(int i=0; i<s.length(); i++) {
            s = s.substring(1) + s.charAt(0);
            if (solution2(s))
                answer++;
        }
        
        return answer;
    }
    
    public boolean solution2(String s) {
        
        if (s.length() == 1)
            return false;
        
        boolean result = true;
        
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            
            Character now = s.charAt(i);
            
            if (now == '[' || now == '(' || now == '{') {
                stack.push(now);
            }
            else {
                if (stack.isEmpty()) {
                    return false;
                }
                else {
                    Character top = stack.pop();
                    if ((now == ']' && top == '[') || (now == ')' && top == '(') || (now == '}' && top == '{')) {
                        continue;
                    }
                        
                    else {
                        return false;
                    }
                }
            }
        }
        
        if (!stack.isEmpty())
            return false;
        
        return result;
    }
}