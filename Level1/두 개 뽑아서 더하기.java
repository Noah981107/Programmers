import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> array = new ArrayList<>();
        int n = numbers.length;
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                int s = numbers[i]+numbers[j];
                if(!array.contains(s)){
                    array.add(s);
                }
            }
        }
        int[] answer = new int[array.size()];
        for(int i=0; i<array.size(); i++){
            answer[i] = array.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}