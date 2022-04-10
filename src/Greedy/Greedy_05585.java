package Greedy;

import java.util.Scanner;

public class Greedy_05585 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 1000 - sc.nextInt();
		int count = 0;
		
		while(n != 0) {
			if(n / 500 != 0) {
				count += n / 500;
				n %= 500; 
			}else if(n / 100 != 0) {
				count += n / 100;
				n %= 100;
			}else if(n / 50 != 0) {
				count += n / 50;
				n %= 50;
			}else if(n / 10 != 0) {
				count += n / 10;
				n %= 10;
			}else if(n / 5 != 0) {
				count += n / 5;
				n %= 5;
			}else {
				count += n % 5;
				n -= n;
			}			
		}
		
		System.out.println(count);
	}
}
