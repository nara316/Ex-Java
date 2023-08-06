class Solution {
    public String solution(String str) {
        String answer = "";

        for (char x : str.toCharArray()) {
            if (65<=x && x<=90) {
                answer += (char)(x+32);
            } else {
                answer += (char)(x-32);
            }
        }
        return answer;
    }
}