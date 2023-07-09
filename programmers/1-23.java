class Solution {
    public int solution(int left, int right) {
        int tanswer=0;
        for(int i=left; i<=right; i++){
            int tmp=0;
            for(int j=1; j<=i; j++){
                if(i%j==0) tmp++;
            }
            tanswer=(tmp%2==0) ? tanswer+i : tanswer-i;
        }
        return tanswer;
    }
}