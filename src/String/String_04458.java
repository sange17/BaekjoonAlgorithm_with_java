package String;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class String_04458 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		String str = "";
		for(int i = 0; i < N; i++) {
			
			str = br.readLine();
			
			str = str.substring(0, 1).toUpperCase() + str.substring(1);
			
			sb.append(str + "\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}
