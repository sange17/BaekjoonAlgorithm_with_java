package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DynamicProgramming_09711 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		long[] array = new long[10001];
		
		StringTokenizer st;
		for(int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int P = Integer.parseInt(st.nextToken());
			int Q = Integer.parseInt(st.nextToken());
			
			array[0] = 1;
			array[1] = 1;
			
			for(int j = 2; j < P; j++) {
				array[j] = array[j-1] % Q + array[j-2] % Q;
			}
			
			sb.append("Case #").append(i).append(": ").append(array[P-1] % Q).append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
