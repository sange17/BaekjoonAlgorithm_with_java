package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_05524 { 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		String str = "";
		for(int i = 0; i < N; i++) {
			
			str = br.readLine();
			
			// toLowerCase()와 toUpperCase() 메소드는 시간복잡도가 O(n)이다.
			str = str.toLowerCase();
			
			sb.append(str + "\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}
