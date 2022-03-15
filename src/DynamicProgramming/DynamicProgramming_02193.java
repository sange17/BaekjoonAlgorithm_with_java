package DynamicProgramming;

import java.util.Scanner;

public class DynamicProgramming_02193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long[] array = new long[91];
		
		array[1] = 1;
		array[2] = 1;
		
		for(int i = 3; i <= n; i++) {
			array[i] = array[i-1] + array[i-2];
		}
		
		System.out.println(array[n]);
	}
}
