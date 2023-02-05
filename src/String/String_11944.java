package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class String_11944 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		String N = st.nextToken();
		String M = st.nextToken();
		int int_N = Integer.parseInt(N);
		int int_M = Integer.parseInt(M);
		
		for(int i = 0; i < int_N; i++) {
			
			sb.append(N);
		}
		
		if(sb.length() >= int_M) {
			
			System.out.println(sb.substring(0, int_M));
		}else {
			
			System.out.println(sb);
		}
		
		br.close();
	}
}
