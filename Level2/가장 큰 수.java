import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
        String[] temp = new String[numbers.length];
        for(int i=0; i<numbers.length; i++){
            temp[i] = Integer.toString(numbers[i]);
        }
        
        Arrays.sort(temp,new Comparator<String>(){
            public int compare(String n1, String n2){
                return ((n2+n1).compareTo(n1+n2));
            }
        });
        
        if(temp[0].equals("0"))
            return "0";
        for(int i=0; i<temp.length; i++){
            answer += temp[i];
        }
        
        return answer;
    }
}