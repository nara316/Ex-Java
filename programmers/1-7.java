class Solution {
    public String solution(String phone_number) {
        char[] tmp = phone_number.toCharArray();
        
        for(int i=0; i<tmp.length-4; i++){
            tmp[i] = '*';
        }
        String answer = String.valueOf(tmp);
        
        return answer;
    }
}