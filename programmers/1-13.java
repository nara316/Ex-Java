import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int divisor) {
        ArrayList<Integer> tmp = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                tmp.add(arr[i]);
            }
        }
        if(tmp.size()==0){
            tmp.add(-1);
        }
        
        Collections.sort(tmp);
        
        return tmp;
    }
}