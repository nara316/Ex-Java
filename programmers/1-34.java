class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int [2];
        int c = 0;
        int x = n*m;

        if (n < m) {
            int tmp = n;
            n = m;
            m = tmp;
        }

        while(m!=0){
            c = n%m;
            n = m;
            m = c;
        }

        answer[0] = n;
        answer[1] = x/n;

        return answer;
    }
}