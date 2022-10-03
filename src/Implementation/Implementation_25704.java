package Implementation;

import java.util.Scanner;

public class Implementation_25704 {
	
	static int N;
	static int P;
	static int sale;
	static int min;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		P = sc.nextInt();
		sale = 0;
		min = Integer.MAX_VALUE;
		int temp = 0;
	
		System.out.println(stamp5(N));
		System.out.println(stamp10(N));
		System.out.println(stamp15(N));
		System.out.println(stamp20(N));
		
		
	}

	private static int stamp20(int n) {
		sale = P - (P * ((N / 20) * 25 / 500));
		
		return sale;
	}

	private static int stamp15(int n) {
		sale = P - ((N / 15) * 2000);
		return sale;
	}

	private static int stamp10(int n) {
		sale = P - (P * ((N / 10) * 500));
		
		return sale;
	}

	private static int stamp5(int n) {

		sale = P - ((N / 5) * 500);
		
		return sale;
	}
}
