import java.util.*;

class Solution {
    static int answer = 0;
    static boolean[] v ;
    
    public void explore(int cur, int idx, int[][] dungeons, int count){
        if (count == v.length || idx >= v.length) {
            
            if (answer<count)
                answer= count;
            return;
        }
        for (int i=0;i<dungeons.length;i++) {
            if (!v[i]&&cur >= dungeons[i][0]) {
                v[i]=true;
                cur -= dungeons[i][1];
                count+=1;
                explore(cur, i, dungeons, count);
                v[i] = false;
                cur +=dungeons[i][1];
                count-=1;
            }
        }
        if (answer<count)
            answer= count;
        
        
    }
    public int solution(int k, int[][] dungeons) {
        v = new boolean[dungeons.length];
        explore(k,0,dungeons,0);
        
        return answer;
    }
}