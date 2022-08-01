class Solution {
    public String solution(int n) {
        String answer = "";
        String[] li = {"4", "1", "2"};
        
        int number = n;
        while(number > 0) {
            int tmp = number % 3;
            number /= 3;
            
            if (tmp == 0)
                number--;
            
            answer = li[tmp] + answer;
        }
        
        return answer;
    }
}