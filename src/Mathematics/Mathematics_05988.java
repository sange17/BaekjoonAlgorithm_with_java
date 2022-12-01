package Mathematics;

import java.util.Scanner;

// 쉬운 문제라도 문제를 잘 읽어야된다...
public class Mathematics_05988 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		
		String num;
		char temp;
		int firstNum = 0;
		for(int i = 0; i < N; i++) {
			num = sc.next();
			
			temp = num.charAt(num.length() - 1);
			
			firstNum = temp - 48;
			
			if(firstNum == 0 || firstNum % 2 == 0)
				sb.append("even" + "\n");
			else
				sb.append("odd" + "\n");
			
			firstNum = 0;
		}
		
		System.out.println(sb);
		sc.close();
	}
}
