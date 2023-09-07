import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
		
		Queue<Integer> bridgeQueue = new LinkedList<Integer>();
		for(int i=0; i<bridge_length; i++) {
			bridgeQueue.add(0);
		}
		
		Queue<Integer> truckQueue = new LinkedList<Integer>();
		for(int i=0; i<truck_weights.length; i++) {
			truckQueue.add(truck_weights[i]);
		}
		
		int nowWeight = 0;
		while(!truckQueue.isEmpty()) {
			if(bridgeQueue.peek() != 0) {
				nowWeight -= bridgeQueue.peek();
			}
			bridgeQueue.poll();
			if(nowWeight+truckQueue.peek() <= weight) {
				nowWeight += truckQueue.peek();
				bridgeQueue.add(truckQueue.poll());				
			} else {
				bridgeQueue.add(0);
			}
			answer++;
		}
		answer += bridge_length;
		
		return answer;
    }
}