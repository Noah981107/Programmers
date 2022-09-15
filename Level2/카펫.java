class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int area = brown + yellow;
        
        for(int x=1; x<=area; x++) {
            
            if (area % x != 0)
                continue;
            
            int y = area / x;
            
            if (x < y)
                continue;
            
            if ((x-2) * (y-2) == yellow){
                answer[0] = x;
                answer[1] = y;
                break;
            }
        }
        return answer;
    }
}