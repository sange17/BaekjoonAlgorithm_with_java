package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class String_04740 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = "";
		int strLength = 0;
		while(true) {
			
			str = br.readLine();
			strLength = str.length();
			
			if(str.equals("***")) {
				
				System.out.println(sb);
				break;
			}
			
			for(int i = strLength - 1; i >= 0; i--) {
				
				sb.append(str.charAt(i));
			}
			
			sb.append("\n");
		}
		
		br.close();
	}
}
