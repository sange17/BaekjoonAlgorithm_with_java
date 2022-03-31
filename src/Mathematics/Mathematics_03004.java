package Mathematics;

import java.util.Scanner;

public class Mathematics_03004 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n == 1) {
			System.out.println(2);
		}else if(n % 2 == 0) {
			System.out.println((n/2+1) * (n/2+1));
		}else{
			System.out.println((n/2+2) * (n/2+1));
		}
	}
}
