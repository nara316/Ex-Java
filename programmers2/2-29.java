import java.util.*;

class Solution {
    public int test3(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int answer = 0;
        
        for (int i = 0; i < scoville.length; i++) {
            pq.offer(scoville[i]);
        }
                           
        while (!pq.isEmpty()) {
            int current = pq.poll();
            
            if (current < K) {
                if (pq.size() == 0) {
                    return -1;
                }
                int next = pq.poll();
                int sum = current + next * 2;
                pq.offer(sum);
                answer++;
                
            }
        }
        return answer;
    }
}