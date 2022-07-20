package Greedy;

import java.util.Scanner;

public class Greedy_01789 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long S = sc.nextLong();
		long sum = 0;
		long count = 0;
		
		while(S >= sum) {
			sum += (++count);
		}
		
		System.out.println(sum == S ? count : count - 1);
	}
}
