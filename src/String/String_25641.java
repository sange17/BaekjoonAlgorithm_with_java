package String;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

// for문 2개는 각각 O(N)의 시간 복잡도
// charAt, sb.append는 각각 O(1)의 시간 복잡도
public class String_25641 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		String sotteok = br.readLine();
		int soCount = 0;
		int tteokCount = 0;
		
		for(int i = 0; i < N; i++) {
			
			char ingredient = sotteok.charAt(i);
			
			if(ingredient == 's') {
				soCount++;
			}else {
				tteokCount++;
			}
		}
		
		for(int i = 0; i < N; i++) {
			
			char ingredient = sotteok.charAt(i);
			
			if(soCount == tteokCount) {
				sb.append(ingredient);				
			}else {
				if(ingredient == 's') {
					soCount--;
				}else {
					tteokCount--;
				}
			}
			
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
