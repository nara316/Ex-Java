class Solution {
    public int solution(int n) {

        int countN = count(n);

        while(true) {
            int count = count(++n);
            if (countN == count) break;
        }

        return n;
    }

    public int count(int n) {
        String x = Integer.toBinaryString(n);
        return x.length() - x.replace("1","").length();
    }
}