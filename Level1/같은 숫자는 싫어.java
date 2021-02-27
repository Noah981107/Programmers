import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        ArrayList<Integer> temp = new ArrayList<Integer>();
        
        int now = arr[0];
        for(int i=1; i<arr.length; i++){
            if(now != arr[i]){
                temp.add(now);
                now = arr[i];
            }
            if(i==arr.length-1){
                temp.add(arr[i]);
            }
        }

        int[] answer = new int[temp.size()];
        for(int i=0; i<temp.size(); i++){
            answer[i] = temp.get(i);
        }
        
        return answer;
    }
}