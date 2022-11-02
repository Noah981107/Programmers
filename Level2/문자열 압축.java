class Solution {
    public int solution(String s) {
        int answer = s.length();
        int length = s.length();
        
        for (int step=1; step <= length / 2; step++) {
            String compress = "";
            String target = s.substring(0, step);
            int count = 1;
            
            for (int j=step; j<length; j += step) {
                String sub = "";
                for (int k=j; k<j+step; k++)
                    if (k <s.length())
                        sub += s.charAt(k);
                
                if (target.equals(sub))
                    count += 1;
                else {
                    compress += (count >= 2)? count + target : target;
                    sub = "";
                    for (int k = j; k < j + step; k++) {
                        if (k < s.length()) 
                            sub += s.charAt(k);
                    }
                    target = sub;
                    count = 1;
                }
            }
            
            if (count >= 2)
                compress += (count + target);
            else
                compress += target;
            
            answer = Math.min(answer, compress.length());
        }
        return answer;
    }
}