package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class String_05789 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		String str = "";
		int strLength = 0;
		for(int i = 0; i < N; i++) {
			
			str = br.readLine();
			strLength = str.length();
			
			if(str.charAt(strLength / 2 - 1) == str.charAt(strLength / 2)) {
				
				sb.append("Do-it\n");
			}else {
				
				sb.append("Do-it-Not\n");
			}
		}
		
		System.out.println(sb);
		br.close();
	}
}
