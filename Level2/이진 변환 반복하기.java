class Solution {
    public int[] solution(String s) {
       int[] answer = new int[2];

        int zeroCount = 0;
        int step = 0;

        String result = "1";

        while(true) {

            if (s.equals(result))
                break;

            int beforeSLength = s.length();
            s = s.replace("0", "");
            int afterSLength = s.length();
            s = Integer.toBinaryString(afterSLength);

            zeroCount += (beforeSLength - afterSLength);
            step++;

        }

        answer[0] = step;
        answer[1] = zeroCount;

        return answer;
    }
}