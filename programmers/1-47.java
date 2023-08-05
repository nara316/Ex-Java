import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        
        int[] check = new int[3];
        int max = 0;
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<answers.length; i++) {
            if(answers[i] == one[i%5]) {
                check[0]++;
            }
            if(answers[i] == two[i%8]) {
                check[1]++;
            }
            if(answers[i] == three[i%10]) {
                check[2]++;
            }
        }
        
        for(int x : check) {
            if(x>max) {
                max = x;
            }
        }
        
        for(int i=0; i<3; i++) {
            if(check[i] == max) {
                list.add(i+1);
            }
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}