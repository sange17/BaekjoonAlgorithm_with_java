package DynamicProgramming;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class DynamicProgramming_01965 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[][] dpArray = new int[2][1001];
		
		for(int i = 1; i <= n; i++) {
			dpArray[0][i] = Integer.parseInt(st.nextToken());
		}
		
		int max = Integer.MIN_VALUE;
		for(int i = 1; i <= n; i++) {
			dpArray[1][i] = 1;
			for(int j = 1; j < i; j++) {
				if(dpArray[0][j] < dpArray[0][i] && dpArray[1][i] < dpArray[1][j] + 1) {
					dpArray[1][i] = dpArray[1][j] + 1;
				}
			}
			max = Math.max(max, dpArray[1][i]);
		}
		System.out.println(max);
		br.close();
	}
}
