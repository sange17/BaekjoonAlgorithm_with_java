package String;

import java.util.Scanner;

public class String_02954 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		String str = sc.nextLine();
		int strLength = str.length();
		char alphabet;
		
		for(int i = 0; i < strLength; i++) {
			
			alphabet = str.charAt(i);
			if(alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u') {
				
				i += 2;
				sb.append(alphabet);
				continue;
			}
			
			sb.append(alphabet);
		}
		
		System.out.println(sb);
		sc.close();
	}
}
