class Solution {
    public int solution(String x, char m) {
        int answer = 0;

        x = x.toUpperCase();
        m = Character.toUpperCase(m);

        for (char c : x.toCharArray()) {
            if(c==m) {
                answer++;
            }
        }
        return answer;
    }
}