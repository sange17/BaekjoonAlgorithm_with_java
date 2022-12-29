package Mathematics;

import java.util.Scanner;

public class Mathematics_21612 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int B = sc.nextInt();
		int P = 5 * B - 400;
		
		if(P > 100) {
			System.out.println(P + "\n" + -1);
		}else if(P == 100) {
			System.out.println(P + "\n" + 0);
		}else {
			System.out.println(P + "\n" + 1);
		}
		
		sc.close();
	}
}
