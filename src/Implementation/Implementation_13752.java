package Implementation;

import java.util.Scanner;

public class Implementation_13752 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int T = sc.nextInt();
		int K = 0;
		
		for(int i = 0; i < T; i++) {
			
			K = sc.nextInt();
			
			for(int j = 0; j < K; j++) {
				sb.append("=");
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
		sc.close();
	}
}
