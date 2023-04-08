package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class String_11091 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		int[] array;
		String str = "";
		int strLength = 0;
		char alphabet;
		for(int i = 0; i < N; i++) {
			
			array = new int[26];
			String makeStr = "";
			
			str = br.readLine();
			str = str.toLowerCase();
			strLength = str.length();
			
			// 문자열에 포함된 알파벳을 배열에 저장
			for(int j = 0; j < strLength; j++) {
				
				alphabet = str.charAt(j);
				if(alphabet >= 'a' && alphabet <= 'z') {

					array[alphabet - 97]++;
				}
			}
			
			// 문자열에 포함되지 않은 새로운 알파벳 문자열 만들기
			for(int j = 0; j < 26; j++) {
				
				if(array[j] == 0) {
					
					makeStr += (char)(j + 97);
				}
			}
			
			
			if(makeStr.length() == 0) {
				
				sb.append("pangram\n");
			}else {
				
				sb.append("missing " + makeStr + "\n");
			}

		}
		
		System.out.println(sb);
		br.close();
	}
}
