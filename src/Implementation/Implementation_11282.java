package Implementation;

import java.util.Scanner;

public class Implementation_11282 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		// '가'의 유니코드(44032)를 이용한 풀이법
		N += 44031;		// 1이 '가'라서 44032에서 1일 뺀 값을 더한다.
		
		char result = (char) N;
		
		System.out.println(result);
	}
}
