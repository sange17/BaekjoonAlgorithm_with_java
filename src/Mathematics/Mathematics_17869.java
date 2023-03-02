package Mathematics;

import java.util.Scanner;

public class Mathematics_17869 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		int count = 0;
		while(n != 1) {
			
			if(n % 2 == 1) {
				n++;
			}else {
				n /= 2;
			}
			
			count++;
		}
		
		System.out.println(count);
		sc.close();
	}
}
