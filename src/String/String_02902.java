package String;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class String_02902 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), "-");
		StringBuilder sb = new StringBuilder();
		
		String word = "";
		while(st.hasMoreTokens()) {
			
			word = st.nextToken();
			sb.append(word.charAt(0));
		}
		
		System.out.println(sb);
		br.close();
	}
}
