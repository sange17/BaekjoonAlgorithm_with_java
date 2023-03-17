package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Mathematics_05054 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		int n = 0;
		int num = 0;
		
		for(int i = 0; i < T; i++) {
			
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;

			n = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine(), " ");
			
			for(int j = 0; j < n; j++) {
				
				num = Integer.parseInt(st.nextToken());
				
				if(num < min) {
					min = num;
				}
				
				if(num > max) {
					max = num;
				}
			}
			
			sb.append((max - min) * 2 + "\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}
