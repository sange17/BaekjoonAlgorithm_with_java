package Mathematics;

import java.util.Scanner;

public class Mathematics_10829 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		long num = sc.nextLong();
		
		while(num != 1) {
			
			if(num % 2 == 1) {
				
				sb.append(1);
				
			}else {
				
				sb.append(0);
			}
			
			num /= 2;
		}
		
		sb.append(1);
		sb.reverse();
		
		System.out.println(sb);
		sc.close();
	}
}
