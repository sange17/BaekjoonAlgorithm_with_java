package String;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class String_03765 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = "";
		while((str = br.readLine()) != null && str.length() != 0) {
			
			sb.append(str + "\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}
