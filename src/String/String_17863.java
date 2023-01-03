package String;

import java.util.Scanner;

public class String_17863 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		if(str.charAt(0) == '5' && str.charAt(1) == '5' && str.charAt(2) == '5') {
			
			System.out.println("YES");
		}else {
			
			System.out.println("NO");
		}
		
		sc.close();
	}
}
