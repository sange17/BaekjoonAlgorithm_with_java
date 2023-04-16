package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Mathematics_09550 {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		int N = 0;
		int K = 0;
		int sum = 0;
		for(int i = 0; i < T; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			
			sum = 0;
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < N; j++) {
				
				sum += Integer.parseInt(st.nextToken()) / K;
			}
			
			sb.append(sum + "\n");
			
		}
		
		System.out.println(sb);
		br.close();
	}
}
