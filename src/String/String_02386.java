package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class String_02386 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		char alphabet;
		int strLength = 0;
		int count;
		while(true) {
			
			String str = br.readLine();
			strLength = str.length();
			
			if(str.equals("#")) break;
						
			alphabet = str.charAt(0);
			str = str.substring(2, strLength);
			str = str.toLowerCase();
			count = 0;
			
			for(int i = 0; i < strLength - 2; i++) {
				
				if(str.charAt(i) == alphabet) {
					
					count++;
				}
			}
			
			sb.append(alphabet + " " + count + "\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}
