package Mathematics;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Mathematics_18398 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		int N = 0;
		
		int first = 0;
		int second = 0;
		for(int i = 0; i < T; i++) {
			
			N = Integer.parseInt(br.readLine());
			
			for(int j = 0; j < N; j++) {
				
				st = new StringTokenizer(br.readLine(), " ");
				
				first = Integer.parseInt(st.nextToken());
				second = Integer.parseInt(st.nextToken());
				
				sb.append((first + second) + " " + (first * second) + "\n");
			}
		}
		
		System.out.println(sb);
		br.close();
	}
}
