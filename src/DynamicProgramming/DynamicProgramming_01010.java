package DynamicProgramming;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class DynamicProgramming_01010 {
	static int[][] dpArray = new int[30][30];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		

		
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			sb.append(combination(M, N)).append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}
	
	static int combination(int n, int r) {
		if(dpArray[n][r] > 0) {
			return dpArray[n][r];
		}
		
		if(n == r || r == 0) {
			return dpArray[n][r] = 1;
		}
		
		return dpArray[n][r] = combination(n - 1, r - 1) + combination(n - 1, r); 
	}
}
