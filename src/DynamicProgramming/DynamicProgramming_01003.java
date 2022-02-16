package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DynamicProgramming_01003 {
	static int[] check = new int[41];
	
	public static int fib(int a) {
		if(a == 0) {
			return 0;
		}else if(a == 1) {
			return 1;
		}else if(check[a] != 0) {
			return check[a];
		}else {
			return check[a] = (fib(a-1) + fib(a-2));			
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[][] dp = new int[41][2];
		dp[0][1] = dp[1][0] = 0;
		dp[0][0] = dp[1][1] = 1;
		
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			
			fib(num);
			
			for(int j = 2; j <= num; j++) {
				dp[j][0] = dp[j-1][0] + dp[j-2][0];
				dp[j][1] = dp[j-1][1] + dp[j-2][1];
			}
			
			sb.append(dp[num][0]).append(" ").append(dp[num][1]).append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
