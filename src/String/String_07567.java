package String;

import java.util.Scanner;

public class String_07567 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int strLength = str.length();
		int height = 10;
		
		for(int i = 1; i < strLength; i++) {
			
			if(str.charAt(i) == str.charAt(i - 1)) {
				
				height += 5;
			}else {
				
				height += 10;
			}
		}
		
		System.out.println(height);
		sc.close();
	}
}
