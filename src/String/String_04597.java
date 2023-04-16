package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class String_04597 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = "";
		int strLength = 0;
		int count1 = 0;
		
		while(true) {
			
			str = br.readLine();
			sb = new StringBuilder();
			strLength = str.length();
			count1 = 0;
			
			if(str.equals("#")) break;
			
			for(int i = 0; i < strLength - 1; i++) {
				
				sb.append(str.charAt(i));
				if(str.charAt(i) == '1') count1++;
			}
			
			if(count1 % 2 == 0 && str.charAt(strLength - 1) == 'e') {
				sb.append("0");
			}else if(count1 % 2 == 0 && str.charAt(strLength - 1) == 'o') {
				sb.append("1");
			}else if(count1 % 2 == 1 && str.charAt(strLength - 1) == 'e') {
				sb.append("1");
			}else if(count1 % 2 == 1 && str.charAt(strLength - 1) == 'o') {
				sb.append("0");
			}
						
			System.out.println(sb);
		}
		
		br.close();
	}
}
