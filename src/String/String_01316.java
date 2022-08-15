package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class String_01316 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int count = 0;

		for(int i = 0; i < N; i++) {
			
			String word = br.readLine();
			boolean isCheck[] = new boolean[26];
			boolean isGroup = true;
			
			for(int j = 0; j < word.length(); j++) {
				
				int idx = word.charAt(j) - 'a';
				
				if(isCheck[idx]) {
					if(word.charAt(j) != word.charAt(j-1)) {
						isGroup = false;
						break;
					}
				}else {
					isCheck[idx] = true;
				}
			}
			if(isGroup) count++;
		}
		
		System.out.println(count);
	}
}
