package Mathematics;

import java.util.Scanner;

public class Mathematics_01977 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int min = Integer.MAX_VALUE;
		int sum = 0;
		double num = 0;
		double changeNum = 0;
		for(int i = M; i <= N; i++) {
			
			num = Math.sqrt(i);
			changeNum = Math.round(num);
			
			if(num - changeNum == 0) {
				
				sum += i;
				
				if(min > i) {
					min = (int) i;
				}
			}
		}
		
		if(sum == 0) {
			System.out.println(-1);
		}else {
			System.out.println(sum + "\n" + min);
		}
	}
}
