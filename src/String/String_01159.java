package String;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class String_01159 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		int idx = 0;
		int[] array = new int[26];
		for(int i = 0; i < N; i++) {
			
			idx = br.readLine().charAt(0) - 97;
			
			array[idx]++;
		}
		
		for(int i = 0; i < 26; i++) {
			
			if(array[i] >= 5) {
				
				sb.append((char)(i + 97));
			}
		}
		
		if(sb.length() == 0) {
			
			System.out.println("PREDAJA");
		}
		else {
			
			System.out.println(sb);
		}
		
		br.close();
	}
}
