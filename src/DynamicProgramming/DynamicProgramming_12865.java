package DynamicProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class DynamicProgramming_12865 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());		// 물건 개수
		int k = Integer.parseInt(st.nextToken());		// 배낭이 버티는 무게
		
		int dp[][] = new int[n+1][k+1];
		int w[] = new int[n+1];		// 무게 배열
		int v[] = new int[n+1];		// 가치 배열
		
		for(int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			w[i] = Integer.parseInt(st.nextToken());
			v[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= k; j++) {
				dp[i][j] = dp[i-1][j];		// 이전 아이템의 가치 저장. 처음에는 0.
				
				// 무게에서 현재 물건의 무게를 뺏을 때 0과 같거나 크면
				if(j - w[i] >= 0) {
					// 이전 물건의 가치와 이전 물건의 가치와 + 현재 자신의 물건의 가치를 더한 값을 비교해서 큰 값을 저장
					dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w[i]] + v[i]);
				}
			}
		}
		
		System.out.println(dp[n][k]);
		br.close();
	}
}
