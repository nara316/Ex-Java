class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count = 0;
        s = s.toLowerCase();

        for(char x : s.toCharArray()){
            if(x == 'p'){
               count++;
            } else if(x == 'y'){
                count--;
            }
        }

        if(count !=0) {
            answer = false;
        }
        return answer;
    }
}
