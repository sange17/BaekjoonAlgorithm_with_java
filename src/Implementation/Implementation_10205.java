package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Implementation_10205 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		int head = 0;
		int count = 0;
		String str = "";
		int strLength = 0;
		for(int i = 0; i < T; i++) {
			
			head = Integer.parseInt(br.readLine());
			count = head;
			str = br.readLine();
			strLength = str.length();
			
			sb.append("Data Set " + (i + 1) + ":\n");
			
			for(int j = 0; j < str.length(); j++) {
				
				if(count == 0) break;
				
				if(str.charAt(j) == 'c') {
					
					count++;
				}else {
					
					count--;
				}
			}
			
			if(i == T - 1) {
				
				sb.append(count);
			}else {
				
				sb.append(count + "\n\n");
			}
		}
		
		System.out.println(sb);
		br.close();
	}
}
