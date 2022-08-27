class Solution {
    public int solution(String word) {
        String alphabet = "AEIOU";
        int[] increaseRate = {781, 156, 31, 6, 1};
        int answer = word.length();

        for (int i = 0; i < word.length(); i++) {
            answer += (increaseRate[i] * alphabet.indexOf(word.charAt(i)));
        }

        return answer;
    }
}