package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class String_05704 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = "";
		int strLength = 0;
		int[] array;
		boolean flag = false;
		
		while(true) {
			
			str = br.readLine();
			strLength = str.length();
			array = new int[26];
			
			if(str.equals("*")) break;
			
			for(int i = 0; i < strLength; i++) {

				if(str.charAt(i) == ' ') continue;

				array[str.charAt(i) - 97]++;
			}
			
			for(int i = 0; i < 26; i++) {
				
				if(array[i] == 0) {
					
					flag = false;
					break;
				}else {
					
					flag = true;
				}
			}
			
			if(flag) {
				sb.append("Y\n");
			}else {
				sb.append("N\n");
			}
		}
		
		System.out.println(sb);
		br.close();
	}
}
