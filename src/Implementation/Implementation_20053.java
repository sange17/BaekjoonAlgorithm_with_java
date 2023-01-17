package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Implementation_20053 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		int N = 0;
		
		int num = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < T; i++) {
			
			N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine(), " ");
			
			for(int j = 0; j < N; j++) {
				
				num = Integer.parseInt(st.nextToken());
				
				if(min > num) {
					min = num;
				}
				
				if(max < num) {
					max = num;
				}
			}
			
			sb.append(min + " " + max + "\n");
			min = Integer.MAX_VALUE;
			max = Integer.MIN_VALUE;
		}
		
		System.out.println(sb);
	}
}
