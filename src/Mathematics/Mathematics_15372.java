package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Mathematics_15372 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		long N = 0;
		
		for(int i = 0; i < T; i++) {
			
			N = Integer.parseInt(br.readLine());
			
			// 출력할 때 int의 범위를 넘어서는 값이 된다. 
			// 출력할 때 int의 범위를 넘어서는 값이 출력될 수 없다.
			sb.append(N * N + "\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}
