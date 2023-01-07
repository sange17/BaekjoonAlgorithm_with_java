package Mathematics;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Mathematics_09085 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		int N = 0;
		int sum = 0;
		
		for(int i = 0; i < T; i++) {
			
			N = Integer.parseInt(br.readLine());
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < N; j++) {
				
				sum += Integer.parseInt(st.nextToken());
			}
			
			sb.append(sum + "\n");
			sum = 0;
		}
		
		System.out.println(sb);
		br.close();
	}
}
