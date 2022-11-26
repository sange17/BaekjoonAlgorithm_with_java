package Implementation;

import java.util.Scanner;

public class Implementation_10886 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int num = 0;
		int count = 0;
		for(int i = 0; i < N; i++) {
			
			num = sc.nextInt();
			
			if(num == 1) {
				count++;
			}
		}
		
		if(count <= (N / 2)) {
			System.out.println("Junhee is not cute!");
		}else {
			System.out.println("Junhee is cute!");
		}
	}
}
