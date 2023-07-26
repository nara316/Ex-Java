class Solution {
    public int solution(int n) {
        int answer = 0;
        String tmp = "";
        
        while(n>0){
            tmp += n%3;
            n = n/3;
        }
        
        answer = Integer.parseInt(tmp,3);
            
        return answer;
    }
}