package Implementation;

import java.util.Scanner;

public class Implementation_10991 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = N - 1; i >= 0; i--) {
			
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			
			for(int j = 0; j < N - i; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
}
