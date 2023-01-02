package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Implementation_25372 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		String str = "";
		int strLength = 0;
		for(int i = 0; i < N; i++) {
			
			str = br.readLine();
			strLength = str.length();
			
			if(strLength >= 6 && strLength <= 9) {
				sb.append("yes\n");
			}else {
				sb.append("no\n");
			}
		}
		
		System.out.println(sb);
		br.close();
	}
}
