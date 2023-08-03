import java.util.*;
 
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        HashMap<Integer, Double> stageFailMap = new HashMap<>();
 
        double stagePerson = stages.length;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            {
                for (int j = 0; j < stages.length; j++) {
                    if (i + 1 == stages[j]) {
                        cnt++;
                    }
                }
                if(stagePerson != 0) {
                stageFailMap.put(i + 1, cnt / stagePerson);
                }
                else {
                    stageFailMap.put(i + 1, 0.0);
                }
                stagePerson -= cnt;
                cnt = 0;
            }
        }
 
        List<Integer> keySetList = new ArrayList<>(stageFailMap.keySet());
 
        // 내림차순
        Collections.sort(keySetList, (o1, o2) -> (stageFailMap.get(o2).compareTo(stageFailMap.get(o1))));
        int i = 0;
        for (Integer key : keySetList) {
            answer[i] = key;
            i++;
        }
 
        return answer;
 
    }
 
}
