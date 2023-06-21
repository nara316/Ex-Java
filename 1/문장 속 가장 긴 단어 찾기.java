/* 한 개의 문장 속 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 가장 앞쪽에 위치한 단어를 답으로 한다. */

import java.util.*;
class Main{
    public String solution(String str){
            String answer = "";
            int max=Integer.MIN_VALUE;
            int pos;

            /*String[] s = str.split(" ");
            for(String x : s){
                int len = x.length();

                if(len>max){
                    max = len;
                    answer = x;
                }
            }*/

            //indexOf(), substring()사용할 경우
            while((pos=str.indexOf(' ')!=-1)){
                String tmp = str.substring(0, pos);
                int len = tmp.length();
                if(len>max){
                    max = len;
                    answer = tmp;
                }
                str = str.substring(pos+1);
            }
            if(str.length()>max){ //마지막 단어는 공백이 뒤에 없기 때문에 while문에서 벗어난다. 따라서 꼭 따로 검사를 해줘야한다. 
                answer = str;
            }
            return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        
        /*한 문장을 받을 떄는 nextLine()*/
        String str = kb.nextLine();

        System.out.print(T.solution(str));
    }
}