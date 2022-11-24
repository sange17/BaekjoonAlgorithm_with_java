package Implementation;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Implementation_10798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		char[][] array = new char[5][15];
		
		for(int i = 0; i < 5; i++) {
			
			for(int j = 0; j < 15; j++) {
				
				array[i][j] = '.';
			}
		}
		
		String str;
		int strLength = 0;
		for(int i = 0; i < 5; i++) {
			str = br.readLine();
			strLength = str.length();
			for(int j = 0; j < strLength; j++) {
				
				array[i][j] = str.charAt(j);
			}
		}
		
		for(int i = 0; i < 15; i++) {
			
			for(int j = 0; j < 5; j++) {
				
				if(array[j][i] == '.') {
					continue;
				}
				sb.append(array[j][i]);
			}
		}
		
		System.out.println(sb);
		br.close();
	}
}
