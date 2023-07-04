class Solution {
    public int solution(int n) {
        int answer = 1, sum = 0, lt = 0;
        int tmp = n/2+1;
        
        if(n==1||n==2) return 1; 
        
        int[] arr = new int[tmp];
        for(int i=0; i<tmp; i++) {
            arr[i] = i+1;}
        
        for(int rt=0; rt<tmp; rt++) {
            sum += arr[rt];
            if(sum==n) answer++;
            while(sum>=n){
                sum -= arr[lt++];
                if(sum==n) answer++;
            }
        }
        return answer;
    }
}