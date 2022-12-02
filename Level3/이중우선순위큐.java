import java.util.StringTokenizer;
import java.util.TreeMap;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];

        TreeMap<Integer, Integer> pq = new TreeMap<>();

        for (String operation : operations) {
            StringTokenizer st = new StringTokenizer(operation);
            String command = st.nextToken();
            Integer number = Integer.parseInt(st.nextToken());

            switch(command) {
                case "I":
                    pq.put(number, pq.getOrDefault(number, 0) + 1);
                    break;
                case "D":

                    if (pq.isEmpty())
                        continue;

                    Integer key = number.equals(-1) ? pq.firstKey() : pq.lastKey();

                    if (pq.get(key) >= 2)
                        pq.put(key, pq.get(key) - 1);
                    else
                        pq.remove(key);

                    break;
            }

            int a = 0;
        }

        if (pq.isEmpty()) {
            answer[0] = 0;
            answer[1] = 0;
        }
        else {
            answer[0] = pq.lastKey();
            answer[1] = pq.firstKey();
        }

        return answer;
    }
}