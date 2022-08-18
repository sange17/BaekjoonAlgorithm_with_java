package DynamicProgramming;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class DynamicProgramming_09251 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String string1 = br.readLine();
		String string2 = br.readLine();
		int[][] dpArray = new int[1001][1001];
		
		for(int i = 1; i <= string1.length(); i++) {
			
			char char1 = string1.charAt(i-1);
			
			for(int j = 1; j <= string2.length(); j++) {
				
				char char2 = string2.charAt(j-1);
				
				if(char1 == char2) {
					dpArray[i][j] = dpArray[i-1][j-1] + 1;
				}else {
					dpArray[i][j] = Math.max(dpArray[i-1][j], dpArray[i][j-1]);
				}
			}
		}
		
		System.out.println(dpArray[string1.length()][string2.length()]);
		br.close();
	}
}
