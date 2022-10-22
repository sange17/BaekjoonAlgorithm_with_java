package Mathematics;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Mathematics_05717 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			int M = Integer.parseInt(st.nextToken());
			int F = Integer.parseInt(st.nextToken());
			
			if(M == 0 || F == 0) {
				break;
			}
			
			sb.append((M + F) + "\n");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
