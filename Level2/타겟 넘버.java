class Solution {
    
    public static int cnt = 0;
    
    public int solution(int[] numbers, int target) {
        int answer = 0;

        int operatorNum = numbers.length;
        char[] operators = {'+', '-'};
        char[] selectedOperators = new char[operatorNum];

        solution2(0, numbers, target, operators, selectedOperators);

        answer = cnt;

        return answer;
    }
    
    public static void solution2(int level, int[] numbers, int target, char[] operators, char[] selectedOperators) {

        int sum = 0;
        if (level == numbers.length) {

            for (int i=0; i< selectedOperators.length; i++) {

                if (selectedOperators[i] == '+') {
                    sum += numbers[i];
                }
                else
                    sum -= numbers[i];
            }

            if (sum == target) {
                cnt++;
            }
            return;
        }

        for (int i=0; i<operators.length; i++) {
            selectedOperators[level] = operators[i];
            solution2(level + 1, numbers, target, operators, selectedOperators);
        }
    }
}