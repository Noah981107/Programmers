import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {
    public List solution(String s) {
        List answer = new ArrayList();

        s = s.substring(2, s.length());
        s = s.substring(0, s.length()-2);
        s = s.replace("},{", "L");

        String[] sSplit = s.split("L");

        Arrays.sort(sSplit, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        for(String element : sSplit) {
            String[] elementSplit = element.split(",");

            for(String value : elementSplit) {
                Integer number = Integer.parseInt(value);

                if (!answer.contains(number))
                    answer.add(number);
            }
        }

        return answer;
    }
}