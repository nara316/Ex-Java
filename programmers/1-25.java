import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();

        for(String x : participant){
            map.put(x, map.getOrDefault(x, 0)+1);
        }

        for(String k : completion){
            map.put(k, map.get(k)-1);
        }
        for(String y : map.keySet()){
            if(map.get(y) != 0){
                answer = y;
                break;
            }
        }

        return answer;
    }
}