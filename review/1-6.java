import java.util.*;

class Solution {
    public String solution(String str) {
        
        HashSet<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        
        for (Char x : str.toCharArray()) {
            if(set.add(x)){
                sb.append(x);
            };
        }
        return sb.toString();
    }
}