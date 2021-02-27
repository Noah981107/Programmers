import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        while(true){
            if(n<3) {
                arr.add(n);
                break;
            }
            arr.add(n%3);
            n = n / 3;
        }
        for(int i=0; i<arr.size(); i++){
            answer += (Math.pow(3,arr.size()-i-1)*arr.get(i));
        }
        return answer;
    }
}