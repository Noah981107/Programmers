class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i=1; i<=n; i++) {
            int sumNumber = 0;
            for(int j=i; j<=n; j++) {
                sumNumber += j;
                if (sumNumber == n)
                    answer++;
                if (sumNumber > n)
                    break;
            }
        }

        return answer;
    }
}