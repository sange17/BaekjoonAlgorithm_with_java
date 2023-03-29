package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Mathematics_11024 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		int sum = 0;
		for(int i = 0; i < T; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			while(st.hasMoreTokens()) {
				
				sum += Integer.parseInt(st.nextToken());
			}
			
			sb.append(sum + "\n");
			sum = 0;
		}
		
		System.out.println(sb);
		br.close();
	}
}
