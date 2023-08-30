class Solution {
     public String solution(String s, String skip, int index) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            result.append(getCharacterAfterIndex(s.charAt(i), index, skip));
        }

        return result.toString();
    }

    private String getCharacterAfterIndex(char c, int index, String skip) {
        char result = c;
        int cnt = 0;

        while (cnt < index) {
            result++;

            if (result > 'z') {
                result = 'a';
            }

            if (isContainsSkip(skip, result)) {
                continue;
            }

            cnt++;
        }

        return String.valueOf(result);
    }

    private boolean isContainsSkip(String skip, char c) {
        return skip.contains(String.valueOf(c));
    }
}