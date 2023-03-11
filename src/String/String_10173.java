package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class String_10173 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = "";
		while(true) {
			
			str = br.readLine();
			
			if(str.equals("EOI")) break;
			
			str = str.toLowerCase();
			
			if(str.contains("nemo")) {
				
				sb.append("Found\n");
			}else {
				
				sb.append("Missing\n");
			}
		}
		
		System.out.println(sb);
		br.close();
	}
}
