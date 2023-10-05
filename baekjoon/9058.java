import java.util.Scanner;

public class Back8958 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int TestCase = sc.nextInt(); 

		int cnt = 0;
		int sum = 0;

		String[] OX = new String[TestCase];

		// OX퀴즈의 결과 입력하기
		for (int i = 0; i < OX.length; i++) {
			OX[i] = sc.next();
		}

		for (int i = 0; i < OX.length; i++) {
			for (int j = 0; j < OX[i].length(); j++) {

				if (OX[i].charAt(j) == 'O') {
					cnt++; 
					sum += cnt; 

				} else if (OX[i].charAt(j) == 'X') {
					cnt = 0; 
				}
			}
			System.out.println(sum);
			
			sum = 0;
			cnt = 0;
		}
		sc.close();
	}
}