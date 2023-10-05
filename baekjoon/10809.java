import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int alb[] = new int[26];

        for (int i =0; i <alb.length; i++) {
            alb[i] = -1;
        }
    
        String st = sc.next();
        
        for (int i=0; i<st.length(); i++){
            char ch = st.charAt(i);
            
            if(alb[ch - 'a'] == -1) {   
             alb[ch - 'a'] = i;
            }
        }
        
        for(int i =0; i<alb.length; i++){
            System.out.print(alb[i] + " ");
        }
    }   
}