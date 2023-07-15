import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        for(int pick : moves){
            for(int i=0; i<board.length; i++){
                if(board[i][pick-1]!=0) {
                    int tmp = board[i][pick-1];
                    board[i][pick-1] = 0;
                    if(!stack.isEmpty() && stack.peek()==tmp){
                        answer += 2;
                        stack.pop();
                    } else {
                        stack.push(tmp);
                    }
                    break;
                }
            }
        }
        return answer;
    }
}