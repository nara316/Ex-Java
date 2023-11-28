import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk ;
        int node =Integer.parseInt(br.readLine());
        boolean[][] arr = new boolean[node][node];
        boolean[] visit = new boolean[arr.length];
        int cnt = Integer.parseInt(br.readLine());

        for (int i = 0 ; i < cnt ;i++) {
            stk = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(stk.nextToken())-1;
            int b = Integer.parseInt(stk.nextToken())-1;

            arr[a][b] = true;
            arr[b][a] = true;

        }

        int result = solution(arr,visit,0);

        System.out.println(result-1);
    }

    private int solution(boolean[][] arr, boolean[] visit, int start) {
        int result = 1;

        visit[start] = true;
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[start][i] && !visit[i]){
                result+= solution(arr, visit, i);
            }
        }

        return result;
    }
}