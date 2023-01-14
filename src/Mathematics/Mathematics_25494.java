package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Mathematics_25494 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		int num = 0;
		int min = 0;
		for(int i = 0; i < T; i++) {
			
			min = Integer.MAX_VALUE;
			
			st = new StringTokenizer(br.readLine(), " ");
			
			for(int j = 0; j < 3; j++) {
				
				num = Integer.parseInt(st.nextToken());
				
				if(num < min) {
					min = num;
				}
			}
			
			sb.append(min + "\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}
