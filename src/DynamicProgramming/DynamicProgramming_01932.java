package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DynamicProgramming_01932 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int dpArray[][] = new int[N+1][N+1];
		int numArray[][] = new int[N+1][N+1];
			
		StringTokenizer st;
		for(int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 1; j <= i; j++) {
				numArray[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		dpArray[1][1] = numArray[1][1];
		
		for(int i = 2; i <= N; i++) {
			for(int j = 1; j <= i; j++) {
				if(j==1)
					dpArray[i][j] = numArray[i][j] + dpArray[i-1][j];
				else
					dpArray[i][j] = numArray[i][j] + Math.max(dpArray[i-1][j], dpArray[i-1][j-1]);
			}
		}
		
		int max = Integer.MIN_VALUE;
		for(int i = 1; i <= N; i++) {
			if(dpArray[N][i] > max) {
				max = dpArray[N][i];
			}
		}
		
		System.out.println(max);
		br.close();
	}
}
