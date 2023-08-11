import java.util.*;

class Solution {
    public int solution(String s) {
        String answer = "";

        for(int i=0; i<s.length(); i++) {
            if(Character.isDigit(s.charAt(i))) {
                x += s.charAt(i);
            }
        }
        return Integer.parseInt(answer);
    }
}