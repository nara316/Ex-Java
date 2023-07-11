class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};

        if(arr.length == 1){
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[arr.length-1];
            int min = arr[0];
            int index = 0;

            for(int i=1; i<arr.length; i++){
                min = Math.min(min,arr[i]);
            }

            for(int k=0; k<arr.length; k++){
                if(min==arr[k]){
                    continue;
                }
                answer[index] = arr[k];
                index++;
            }
        }
        return answer;
    }
}
