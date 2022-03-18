package Mathematics;

import java.util.Scanner;

public class Mathematics_20492 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int test1 = n * 78 / 100;
		int test2 = n - (n * 20 / 100) * 22 / 100;
		
		System.out.println(test1 + " " + test2);
	}
}
