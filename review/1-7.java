import java.util.*;

class Solution {
    public String solution(String str) {
        String answer = "YES";
        
        String reverse = new StringBuilder(str).reverse().toString();

        if (!str.equals(reverse)) {
            return "NO";
        }
        
        return answer;
    }
}