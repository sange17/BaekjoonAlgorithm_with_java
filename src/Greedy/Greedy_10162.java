package Greedy;

import java.util.Scanner;

public class Greedy_10162 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int A = n / 300;
		n %= 300;
		int B = n / 60;
		n %= 60;
		int C = n / 10;
		n %= 10;
		
		if(n != 0) {
			System.out.println(-1);
		}else {
			System.out.println(A + " " + B + " " + C);
		}
	}
}
