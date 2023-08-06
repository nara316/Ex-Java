class Solution {
    public String solution(String str) {
        String answer = "";
        int max = 0;

        String[] arr = str.split(" ");

        for (int i=0; i<arr.length; i++) {
            if (max<arr[i].length()) {
                max = arr[i].length();
                answer = arr[i];
            }
        }
        
        return answer;
    }
}