package Mathematics;

import java.util.Scanner;

public class Mathematics_08393 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum+=i;
		}
		System.out.print(sum);
	}
}
