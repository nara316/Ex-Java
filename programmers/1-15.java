import java.util.*;

class Solution {
    public ArrayList solution(long n) {
        
        ArrayList list = new ArrayList();
        
        while(n>0){
            list.add(n%10);
            n = n/10;
        }
        return list;
    }
}