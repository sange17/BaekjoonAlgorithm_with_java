package DynamicProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DynamicProgramming_10844 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		long mod = 1000000000;
		long result = 0;
		
		long[][] dpArray = new long[N+1][10];
		for(int i = 1; i <= 9; i++) {
			dpArray[1][i] = 1;
		}
		
		for(int i = 2; i <= N; i++) {
			for(int j = 0; j < 10; j++) {
				if(j == 0) {
					dpArray[i][j] = dpArray[i-1][j+1] % mod; 
				}else if(j == 9) {
					dpArray[i][j] = dpArray[i-1][j-1] % mod;
				}else {
					dpArray[i][j] = (dpArray[i-1][j-1] + dpArray[i-1][j+1]) % mod;
				}
			}
		}
		
		for(int i = 0; i < 10; i++) {
			result += dpArray[N][i];
		}
		
		System.out.println(result % mod);
	}
}
