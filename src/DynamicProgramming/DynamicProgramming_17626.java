package DynamicProgramming;

import java.util.Scanner;

public class DynamicProgramming_17626 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] dpArray = new int[n+1];
		dpArray[0] = 0;
		dpArray[1] = 1;
		
		for(int i = 2; i <= n; i++) {
			int min = Integer.MAX_VALUE;
			for(int j = 1; j * j <= i; j++) {
				min = Math.min(min, dpArray[i - j * j]);
			}
			dpArray[i] = min + 1;
		}
		
		System.out.println(dpArray[n]);
	}
}
