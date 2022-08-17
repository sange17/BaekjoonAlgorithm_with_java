package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class String_01264 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String str = br.readLine();
			
			if(str.equals("#")) break;
			
			int count = 0;
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == 'a' || 
						str.charAt(i) == 'e' || 
						str.charAt(i) == 'i' || 
						str.charAt(i) == 'o' || 
						str.charAt(i) == 'u' ||
						str.charAt(i) == 'A' ||
						str.charAt(i) == 'E' ||
						str.charAt(i) == 'I' ||
						str.charAt(i) == 'O' ||
						str.charAt(i) == 'U') {
					count++;
				}
			}
			
			sb.append(count + "\n");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
