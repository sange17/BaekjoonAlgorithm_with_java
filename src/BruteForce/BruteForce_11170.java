package BruteForce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BruteForce_11170 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		int N = 0;
		int M = 0;
		
		String num = "";
		int length = 0;
		for(int i = 0; i < T; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			int count = 0;
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			
			for(int j = N; j <= M; j++) {
				
				num = Integer.toString(j);
				
				length = num.length();
				
				for(int k = 0; k < length; k++) {
					
					if(num.charAt(k) == '0') {
						count++;
					}
				}
				
			}
			
			sb.append(count + "\n");
		}
		System.out.println(sb);

		br.close();
	}
}
