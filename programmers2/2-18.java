import java.util.ArrayList;
import java.util.List;

static public List<Long> solution(int n, long left, long right) {
        List<Long> ans = new ArrayList<>();

        for (long i = left; i <= right; i++) {
            long temp = Math.max(i / n, i % n) + 1;
            ans.add(temp);
        }

        return ans;
    }
