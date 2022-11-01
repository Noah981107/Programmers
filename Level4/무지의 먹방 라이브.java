import java.util.*;

class Solution {
    
    class Food implements Comparable<Food> {
        private int time;
        private int index;
        
        public int getTime() { return this.time; }
        public int getIndex() { return this.index; }
        
        public Food(int time, int index) {
            this.time = time;
            this.index = index;
        }
        
        public int compareTo(Food food) {
            return Integer.compare(this.getTime(), food.getTime());
        }
        
        public String toString() {
            return "Food -> " + "time : " + this.getTime() + " index : " + this.getIndex();
        }
        
    }
    
    public int solution(int[] food_times, long k) {
        int answer = 0;
        
        long sum = 0;
        for(int foodTime : food_times) {
            sum += foodTime;
        }
        if (sum <= k)
            return -1;
        
        PriorityQueue<Food> pq = new PriorityQueue<>();
        for (int i=0; i<food_times.length; i++) {
            pq.offer(new Food(food_times[i], i + 1));
        }
        
        int summary = 0;
        long previous = 0;
        long length = food_times.length;
        
        while (summary + ((pq.peek().getTime() - previous) * length) <= k) {
            Food now = pq.poll();
            summary += (now.getTime() - previous) * length;
            length -= 1;
            previous = now.getTime();
        }
        
        ArrayList<Food> arr = new ArrayList<>();
        while (!pq.isEmpty()) {
            arr.add(pq.poll());
        }
        
        Collections.sort(arr, new Comparator<Food>() {
            
            public int compare(Food f1, Food f2) {
                return Integer.compare(f1.getIndex(), f2.getIndex());
            }
        });
            
        return arr.get((int) ((k - summary) % length)).getIndex();
    }
}