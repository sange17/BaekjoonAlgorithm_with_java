package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Implementation_01371 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = "";
		int strLength = 0;
		int[] array = new int[26];
		int max = 0;
		int indexNum = 0;
		
		while(true) {
			
			str = br.readLine();
			strLength = str.length();
			
			if(str.equals("") || str == null || str.isEmpty() || str.length() == 0) {
				break;
			}else {
				for(int i = 0; i < strLength; i++) {
					
					if(str.charAt(i) == ' ') {
						continue;
					}
					
					indexNum = str.charAt(i) - 97;
					array[indexNum]++;
					
					if(max < array[indexNum]) {
						
						max = array[indexNum];
					}
				}
			}
		}
		for(int i = 0; i < 26; i++) {
			
			if(array[i] == max) {
				
				sb.append((char)('a' + i));
			}
		}			
		
		System.out.println(sb);
		br.close();
	}
}
