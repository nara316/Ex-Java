/*한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.*/

import java.util.*;
class Main{
    public int solution(String str, char t){
        int answer=0;
        str = str.toUpperCase();
        t=Character.toUpperCase(t);
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==t){
                answer++;
            }
            /*
             * String의 경우 비교할 때 .equals() 메서드 사용
             * char은 == 사용한다.
             */
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        
        /* 문자열과 문자를 받아야한다.*/
        String str = kb.next();
        char c=kb.next().charAt(0); //문자열의 첫번째 문자 하나를 리턴

        System.out.print(T.solution(str, c));
    }
}
