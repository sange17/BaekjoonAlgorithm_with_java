package Mathematics;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Mathematics_03059 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		String str = "";
		int strLength = 0;
		int sum = 0;
		int[] array;
		for(int i = 0; i < T; i++) {
			
			str = br.readLine();
			strLength = str.length();
			array  = new int[26];
			for(int j = 0; j < strLength; j++) {
				
				array[str.charAt(j) - 65]++;
			}
			
			for(int j = 0; j < 26; j++) {
				
				if(array[j] == 0) {
					
					sum += (65 + j);
				}
			}
			
			sb.append(sum + "\n");
			
			sum = 0;
		}
		
		System.out.println(sb);
		br.close();
	}
}
