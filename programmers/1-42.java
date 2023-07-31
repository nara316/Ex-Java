class Solution {
    public int solution(int[][] sizes) {
        int totalMax = 0;
        int totalMin = 0;

        for (int size[] : sizes) {
            int max = Math.max(size[0], size[1]);
            int min = Math.min(size[0], size[1]);
            totalMax = Math.max(max, totalMax);
            totalMin = Math.max(min, totalMin);
        }

        return totalMax * totalMin;
    }
}