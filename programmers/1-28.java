class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int length = nums.length;
            
        for(int i=0; i<length-2; i++){
            for(int j=i+1; j<length-1; j++){
                for(int k=j+1; k<length; k++){
                    int tmp = nums[i]+nums[j]+nums[k];
                    if(checkSum(tmp)==true) answer++;
                }
            }
        }
        return answer;
    }
    
     public boolean checkSum(int sum){
        boolean check = true; 
            if(sum==2) {
                return true;
            }else{
                for(int i=2; i<sum; i++){
                    if(sum%i==0){
                     check = false;  
                        break;
                    }
                }
            }
            return check;
        }
}