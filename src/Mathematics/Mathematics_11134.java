package Mathematics;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Mathematics_11134 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder(0);
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			
			if(N % C == 0) {
				
				sb.append(N / C);
			}else {
				
				sb.append(N / C + 1);
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}
