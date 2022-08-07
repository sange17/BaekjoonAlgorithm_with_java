package String;

import java.util.Scanner;

public class String_09086 {
	public static void main(String[] atgs) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			String str = sc.next();
			
			char first = str.charAt(0);
			char finish = str.charAt(str.length() - 1);
			
			sb.append(first + "" + finish + "\n");
		}
		
		System.out.println(sb.toString());
	}
}
