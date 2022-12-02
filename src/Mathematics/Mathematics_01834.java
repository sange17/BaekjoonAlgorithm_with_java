package Mathematics;

import java.util.Scanner;

public class Mathematics_01834 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		long sum = 0;
		long multiple = N;
		long num = 1;
		while(true) {
			
			if(num == N) {
				System.out.println(sum);
				break;
			}
			
			sum += (multiple + num);
			
			num++;
			multiple = N * num;
		}
		
		sc.close();

	}
}
