import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        int[] exp = {-1};
        
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor == 0)
                temp.add(arr[i]);
        }
        
        int[] answer = new int[temp.size()];
        for(int i=0; i<temp.size(); i++){
            answer[i] = temp.get(i);
        }
        
        Arrays.sort(answer);
        
        if(answer.length==0)
            return exp;
        
        return answer;
        
    }
}