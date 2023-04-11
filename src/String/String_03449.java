package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class String_03449 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		String firstStr = "";
		String secondStr = "";
		int strLength = 0;
		int sum;
		for(int i = 0; i < T; i++) {
			
			sum = 0;
			
			firstStr = br.readLine();
			secondStr = br.readLine();
			
			strLength = firstStr.length();
			
			for(int j = 0; j < strLength; j++) {
				
				if(firstStr.charAt(j) != secondStr.charAt(j)) {
					
					sum++;
				}
			}
			
			sb.append("Hamming distance is " + sum + ".\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}
