package Mathematics;

import java.util.Scanner;

public class Mathematics_27433 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long fac = 1;
		
		for(int i = N; i >= 1; i--) {
			
			if(N == 0) break;
			
			fac *= i;
		}
		
		System.out.println(fac);
		sc.close();
	}
}
