import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;

        int count = Integer.parseInt(br.readLine());

        for(int i=0; i<count; i++){

            Stack<Character> stack = new Stack<>();

            st = new StringTokenizer(br.readLine(), "\n");
            String input = st.nextToken();

            int inputLength = input.length();

            for(int j=0; j<input.length(); j++){
                char[] inputArray = input.toCharArray();
                if(inputArray[j] == '('){
                    stack.push('(');
                }
                else{
                    if(stack.empty()) break;
                    else stack.pop();
                }
                inputLength--;
            }

            if(stack.empty() && (inputLength == 0)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}