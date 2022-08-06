package String;

import java.util.Scanner;

public class String_02744 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		String str = sc.nextLine();
		
		for(int i = 0; i < str.length(); i++) {
			int alphabet = str.charAt(i);
			
			if(65 <= alphabet && alphabet <= 90) {
				sb.append((char)(alphabet + 32));
			}else {
				sb.append((char)(alphabet - 32));
			}
		}
		
		System.out.println(sb.toString());
	}
}
