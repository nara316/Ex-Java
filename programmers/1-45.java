import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int x : nums) {
            set.add(x);
        }

        return (set.size() < (nums.length/2)) ? set.size() : nums.length/2;
    }
}
