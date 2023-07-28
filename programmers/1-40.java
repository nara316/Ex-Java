class Solution {
    public String solution(int[] food) {
        StringBuffer sb = new StringBuffer();
        String answer = "";

        for (int i=1; i<food.length; i++) {
            int tmp = food[i]/2;
            if (tmp>0){
                sb.append(String.valueOf(i).repeat(tmp));
            }
        }

        answer = sb + "0";
        answer += sb.reverse();

        return answer;
    }
}