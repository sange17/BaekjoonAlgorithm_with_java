package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Mathematics_05347 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		long a = 0;
		long b = 0;
		long min = 0;
		long result = 0;
		for(int i = 0; i < T; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			min = Math.min(a, b);
			
			for(long j = min; j >= 1; j--) {
				
				
				if(a % j == 0 && b % j == 0) {
					
					result = j * (a / j) * (b / j);
					
					sb.append(result + "\n");
					break;
				}
			}
		}
		System.out.println(sb);
		br.close();
	}
}
