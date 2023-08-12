class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;
        for(int i=3; i<=total; i++) {
            int j = total/i; 

            if((total%i==0) &&(j>=3)) {
                int width = Math.max(i,j);
                int height = Math.min(i,j);
                int middle = (width-2)*(height-2);

                if(yellow == middle) {
                    answer[0] = width;
                    answer[1] = height;
                }
            }
        }

        return answer;
    }
}