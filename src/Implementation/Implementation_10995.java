package Implementation;

import java.util.Scanner;

public class Implementation_10995 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			
			if(i % 2 != 0) {
				
				for(int j = 0; j < N; j++) {
					sb.append("* ");
				}
				
				sb.append("\n");
			}else {
				
				for(int j = 0; j < N; j++) {
					sb.append(" *");
				}
				
				sb.append("\n");
			}
		}
		
		System.out.println(sb);
		sc.close();
	}
}
