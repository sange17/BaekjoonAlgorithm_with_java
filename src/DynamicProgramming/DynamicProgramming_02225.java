package DynamicProgramming;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class DynamicProgramming_02225 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[][] dpArray = new int[K+1][N+1];
		
		for(int i = 1; i <= K; i++) {
			dpArray[i][0] = 1;
		}
		
		for(int i = 1; i <= K; i++) {
			for(int j = 1; j <= N; j++) {
				dpArray[i][j] = (dpArray[i][j-1] + dpArray[i-1][j]) % 1000000000;
			}
		}
		System.out.println(dpArray[K][N]);
	}
}
