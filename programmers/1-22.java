import java.util.*;

class Solution {
  public long solution(long n) {
    String[] strarr = String.valueOf(n).split("");
    Arrays.sort(strarr, Collections.reverseOrder());

    StringBuilder sb = new StringBuilder();
    for (String list : strarr) sb.append(list);

    return Long.parseLong(sb.toString());
  }
}