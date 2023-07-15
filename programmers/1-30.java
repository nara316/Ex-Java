class Solution {
    public String solution(String s) {
        String answer = "";
        int tmp = 1;
        String[] arr = s.split("");

       for(String x : arr){
           tmp = x.contains(" ")? 1 : tmp+1;
           answer += tmp%2==0 ? x.toUpperCase() : x.toLowerCase();
       }
        return answer;
    }
}