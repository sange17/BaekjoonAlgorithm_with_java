package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Mathematics_09295 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		int a = 0;
		int b = 0;
		for(int i = 1; i <= T; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			sb.append("Case " + i + ": " + (a + b) + "\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}
