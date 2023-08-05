class Solution {
    public int[] solution(String s) {
        int count = 0;
        int deleteZero = 0;
        
        while(true) {
            count++;
            int length = s.length();
            s = s.replaceAll("0","");
            deleteZero += length - s.length();
            
            if(s.equals("1")) break;
            
            s = Integer.toBinaryString(s.length());
        }
        
        int[] answer = {count, deleteZero};
        return answer;
    }
}