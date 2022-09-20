import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        Map<String, Integer> map = new HashMap<>();
        
        for(String[] ele : clothes) {
            String type = ele[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }
        
        for(String ele : map.keySet()) {
            answer *= (map.get(ele) + 1);
        }
        
        answer--;
        return answer;
    }
}