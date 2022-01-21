package Implementation;

import java.io.IOException;
import java.util.Scanner;

public class Implementation_10820 {
	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine()) {
			String str = sc.nextLine();
			int lower = 0;
			int upper = 0;
			int digit = 0;
			int space = 0;
			for(int i = 0; i < str.length(); i++) {
				char a = str.charAt(i);
				
				if(a >= 'a' && a <= 'z') {
					lower++;
				} else if(a >= 'A' && a <= 'Z') {
					upper++;
				} else if(a >= '0' && a <= '9') {
					digit++;
				} else if(a == ' ') {
					space++;
				}
			}
			System.out.println(lower + " " + upper + " " + digit + " " + space);
		}
		sc.close();
	}
}
