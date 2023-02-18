package Mathematics;

import java.util.Scanner;

public class Mathematics_02921 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int sum = 0;
		for(int i = N; i >= 0; i--) {
			
			sum += i;
			for(int j = N; j >= 0; j--) {
				
				sum += j;
			}
		}
		
		System.out.println(sum);
		sc.close();
	}
}
