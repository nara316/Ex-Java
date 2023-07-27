class Solution {
    public String solution(String s) {
        String answer = "";
        String[] words = s.toLowerCase().split("");

        boolean check = true;

        for (String word : words) {
            answer += check ? word.toUpperCase() : word;
            check = word.equals(" ") ? true : false;
        }

        return answer;
    }
}