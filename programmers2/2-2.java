import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] stringArray = s.split(" ");
        
        int[] tmp = Arrays.stream(stringArray)
                        .mapToInt(Integer::parseInt)
                        .sorted().toArray();
        
        answer = tmp[0]+" "+tmp[tmp.length-1];
        return answer;
    }
}