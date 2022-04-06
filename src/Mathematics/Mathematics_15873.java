package Mathematics;

import java.math.BigInteger;
import java.util.Scanner;

public class Mathematics_15873 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int a = 0;
		int b = 0;
		
		if(str.length() == 2) {
			a = str.charAt(0) - 48;
			b = str.charAt(1) - 48;
			System.out.println(a + b);
		}else if(str.length() == 3) {
			
		}
	}
}
