package DynamicProgramming;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DynamicProgramming_15489 {
	static int[][] dpArray = new int[31][31];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		int sum = 0;
		
		R--;
		C--;
		
		int c = C;
		for(int i = 0; i < W; i++) {
			for(int j = 0; j <= i; j++) {
				sum += combination(R, C);
				C++;
			}
			R++;
			C = c;
		}
		
		System.out.println(sum);
		br.close();
	}
	
	static int combination(int n, int r) {
		if(dpArray[n][r] > 0) {
			return dpArray[n][r];
		}
		
		if(n == r || r == 0) {
			return 1;
		}
		
		return dpArray[n][r] = combination(n-1, r-1) + combination(n-1, r);
	}
}
