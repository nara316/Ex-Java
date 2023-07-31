class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int date = 0;

        //
        for (int i=0; i<a-1; i++) {
            date += month[i];
        }

        date += b-1;

        answer = day[date%7];

        return answer;
    }
}