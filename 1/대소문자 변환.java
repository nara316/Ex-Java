/* 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요. */

import java.util.*;
class Main{
    public String solution(String str){
            String answer = "";

            for(char x : str.toCharArray()){
                if(Charater.isLowerCase(x)){ /*x가 소문자인지 확인하는 메서드 */
                    answer += Character.toUpperCase(x);
                } else {
                    answer += Character.toLowerCase(x);
                }
            }

            /*
             * 아스키로 풀어도 된다.
             * 대문자는 65~90 소문자는 97 ~ 122 둘의 차이는 32
             *  for(char x : str.toCharArray()){
               if(97<=x<=122){
                    answer += (char)(x-32);
               } else {
                answer += (char)(x+32);
               }
            }
             */
            return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        
        /* 문자열과 문자를 받아야한다.*/
        String str = kb.next();

        System.out.print(T.solution(str));
    }
}

