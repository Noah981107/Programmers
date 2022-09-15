import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int[] turnCheck = new int[n+1];
        Set<String> alreadyTold = new HashSet<>();

        alreadyTold.add(words[0]);
        int turn = 1;
        turnCheck[turn] = 1;
        char lastChar = words[0].charAt(words[0].length() - 1);
        for(int i=1; i<words.length; i++) {

            turn += 1;
            if (turn > n)
                turn = 1;
            turnCheck[turn] += 1;

            if (alreadyTold.contains(words[i])) {
                answer[0] = turn;
                answer[1] = turnCheck[turn];
                return answer;
            }

            alreadyTold.add(words[i]);
            char firstChar = words[i].charAt(0);
            
            if (lastChar == firstChar)
                lastChar = words[i].charAt(words[i].length() - 1);
            else {
                answer[0] = turn;
                answer[1] = turnCheck[turn];
                return answer;
            }
        }
        
        return answer;
    }
}