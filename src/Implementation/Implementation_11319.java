package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Implementation_11319 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int S = Integer.parseInt(br.readLine());
		String str = "";
		int strLength = 0;
		char ch;
		int vowels = 0;
		int consonants = 0;
		
		for(int i = 0; i < S; i++) {
			
			str = br.readLine();
			strLength = str.length();
			
			for(int j = 0; j < strLength; j++) {
				
				ch = str.charAt(j);
				
				if(ch == ' ') {
					continue;
				}else if(ch == 'A' || ch == 'a') {
					vowels++;
				}else if(ch == 'E' || ch == 'e') {
					vowels++;
				}else if(ch == 'I' || ch == 'i') {
					vowels++;
				}else if(ch == 'O' || ch == 'o') {
					vowels++;
				}else if(ch == 'U' || ch == 'u') {
					vowels++;
				}else {
					consonants++;
				}
			}
			
			sb.append(consonants + " " + vowels + "\n");
			vowels = 0;
			consonants = 0;
		}
		
		System.out.println(sb);
		br.close();
	}
}
