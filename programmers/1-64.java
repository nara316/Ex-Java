import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        
        int heightMin = wallpaper.length;
        int heightMax = 0;
        int widthMin = 50;
        int widthMax = 0;
        
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++){
                if (wallpaper[i].charAt(j) == '#'){
                    heightMin = Math.min(i, heightMin);
                    heightMax = Math.max(i, heightMax);
                    widthMin = Math.min(j, widthMin);
                    widthMax = Math.max(j, widthMax);
                }
            }
        }
        
        int[] answer = {heightMin, widthMin, heightMax + 1, widthMax + 1};
        return answer;
    }
}​