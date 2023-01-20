package Implementation;

import java.util.Scanner;

public class Implementation_08545 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		String str = sc.nextLine();
		int strLength = str.length();
		
		for(int i = strLength - 1; i >= 0; i--) {
			
			sb.append(str.charAt(i));
		}
		
		System.out.println(sb);
		sc.close();
	}
}
