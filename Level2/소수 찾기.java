import java.util.ArrayList;
import java.util.List;

class Solution {
public static int solution(String numbers) {
        int answer = 0;
        boolean[] visited = new boolean[numbers.length()];
        List<Integer> arr = new ArrayList<>();

        for(int i=1; i<=numbers.length(); i++) {
            dfs(numbers, "", i, visited, arr);
        }

        for(Integer ele : arr) {
           if(prime(ele))
               answer++;
        }

        return answer;
    }

    public static void dfs(String str, String foundNumber, int numberLength, boolean[] visited, List<Integer> arr) {

        if (foundNumber.length() == numberLength) {
            int number = Integer.parseInt(foundNumber);
            if (!arr.contains(number)) {
                arr.add(number);
            }

        }

        for(int i=0; i<str.length(); i++) {
            if(!visited[i]) {
                visited[i] = true;
                foundNumber += str.charAt(i);
                dfs(str, foundNumber, numberLength, visited, arr);
                visited[i] = false;
                foundNumber = foundNumber.substring(0, foundNumber.length()-1);
            }
        }
    }

    public static boolean prime(int n) {
        if(n<2) return false;

        for(int i=2; i*i<=n; i++) {
            if(n % i == 0) return false;
        }

        return true;
    }
}