package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Greedy_11034 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int A = 0;
		int B = 0;
		int C = 0;
		String str;
		
		StringTokenizer st;
		while((str = br.readLine()).length() != 0) {
			
				st = new StringTokenizer(str, " ");
				
				A = Integer.parseInt(st.nextToken());
				B = Integer.parseInt(st.nextToken());
				C = Integer.parseInt(st.nextToken());
							
				sb.append(Math.max(B-A, C-B) - 1).append("\n");
			
		}
		
		System.out.println(sb);
		br.close();
	}
}
