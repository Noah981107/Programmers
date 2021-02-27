import java.util.*;
class Solution {
    
    public int[] solution(int[] progresses, int[] speeds) {
        
        
        
        ArrayList<Integer> queue = new ArrayList<Integer>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        
        for(int i=0; i<progresses.length; i++){
            int day = 100 - progresses[i];
            for(int j=1; j<=100; j++){
                if(speeds[i]*j>=day){
                    queue.add(j);
                    break;
                }
                    
            }
        }
        
        int count = 1;
        int j=0;
        while(true){
            if(queue.get(j)>=queue.get(j+1)){
                queue.remove(j+1);
                count++;
            }
            else{
                j++;
                temp.add(count);
                count = 1;
            }
            if(queue.size()-1 == temp.size()){
                temp.add(count);
                break;
            }
        }
        int[] answer = new int[temp.size()];
        for(int i=0; i<temp.size();i++){
            answer[i] = temp.get(i);
        }
        return answer;
    }
}