class Solution {
    public String solution(String s, int n) {
        StringBuffer sb = new StringBuffer();
        
        for (char x : s.toCharArray()) {
            if (x == 32) {
                sb.append(x);
                //범위를 넘어가면? 
            } else if ((x <= 90 && 90 < x+n) || (x <= 122 && 122 < x+n)) {
                sb.append((char)(x+n-26));
            } else {
                sb.append((char)(x+n));
            }
        }
        return sb.toString();
    }
}