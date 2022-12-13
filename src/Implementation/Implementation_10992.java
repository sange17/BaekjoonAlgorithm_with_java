package Implementation;

import java.util.Scanner;

public class Implementation_10992 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if(N == 1) {
			System.out.println("*");
		}else {
			
			// 맨 위 별 하나 출력
			for(int i = 0; i < N - 1; i++) {
				System.out.print(" ");
			}
			System.out.println("*");
			
			// 맨 아래 줄 출력 전까지 출력
			for(int i = 1; i < N - 1; i++) {
				
				for(int j = 0; j < N - i - 1; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				
				for(int j = 0; j < i * 2 - 1; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println();
			}
			
			// 마지막 줄 출력
			for(int i = 0; i < N * 2 - 1; i++) {
				System.out.print("*");
			}
		}
	}
}
