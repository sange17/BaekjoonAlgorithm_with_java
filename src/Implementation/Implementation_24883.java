package Implementation;

import java.util.Scanner;

public class Implementation_24883 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextLine().charAt(0);
		
		if(a == 'N' || a == 'n') {
			System.out.println("Naver D2");
		}else {
			System.out.println("Naver Whale");
		}
		
		sc.close();
	}
}
