import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int array[] = new int[30];  
		int student = 0;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = 0;
		}
		
		for (int i = 0; i < 28; i++) {
			student = Integer.parseInt(br.readLine()) - 1; 
			array[student] = student + 1;	
		}
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) System.out.println(i + 1);
		}
		
		br.close();
	}
}