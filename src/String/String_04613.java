package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class String_04613 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str;
		int strLength = 0;
		int sum;
		while(true) {
			
			str = br.readLine();
			strLength = str.length();
			sum = 0;
			
			if(str.equals("#")) break;
			
			for(int i = 0; i < strLength; i++) {
				
				if(str.charAt(i) == ' ') {
					
					sum += 0;
				}else {
					
					sum += ((i + 1) * (str.charAt(i) - 65 + 1));
				}
			}
			
			sb.append(sum + "\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}
