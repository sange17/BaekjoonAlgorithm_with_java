package DynamicProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DynamicProgramming_11057 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[][] dpArray = new int[N+1][10];
		
		for(int i = 0; i < 10; i++) dpArray[0][i] = 1;
		
		for(int i = 1; i <= N; i++) {
			for(int j = 0; j < 10; j++) {
				for(int k = j; k < 10; k++) {
					dpArray[i][j] += dpArray[i-1][k];					
				}
				dpArray[i][j] %= 10007;
			}
		}
		
		System.out.println(dpArray[N][0] % 10007);
		br.close();
	}
}
