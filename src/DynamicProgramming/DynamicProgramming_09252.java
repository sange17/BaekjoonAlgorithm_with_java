package DynamicProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DynamicProgramming_09252 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String string1 = br.readLine();
		String string2 = br.readLine();
		int[][] dpArray = new int[1001][1001];
		
		for(int i = 1; i <= string1.length(); i++) {
			for(int j = 1; j <= string2.length(); j++) {
				
				char char1 = string1.charAt(i-1);
				char char2 = string2.charAt(j-1);
				
				if(char1 == char2) {
					dpArray[i][j] = dpArray[i-1][j-1] + 1;
				}else {
					dpArray[i][j] = Math.max(dpArray[i-1][j], dpArray[i][j-1]);
				}
			}
		}
		
		int i = string1.length();
		int j = string2.length();
		StringBuilder sb = new StringBuilder();
		
		while(i > 0 && j > 0) {
			if(dpArray[i][j] == dpArray[i-1][j]) {
				i--;
			}else if(dpArray[i][j] == dpArray[i][j-1]) {
				j--;
			}else {
				i--;
				j--;
				sb.append(string1.charAt(i));
			}
		}
		
		System.out.println(dpArray[string1.length()][string2.length()]);
		System.out.println(sb.reverse().toString());
		br.close();
	}
}
