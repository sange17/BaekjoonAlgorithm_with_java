package DynamicProgramming;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class DynamicProgramming_09465 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		for(int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			int [][] array = new int[2][N+1];
			int [][] dpArray = new int[2][N+1];
			
			for(int j = 0; j < 2; j++) {
				st = new StringTokenizer(br.readLine(), " ");
				for(int k = 1; k <= N; k++) {
					array[j][k] = Integer.parseInt(st.nextToken());
				}
			}
			
			dpArray[0][1] = array[0][1];
			dpArray[1][1] = array[1][1];
			
			for(int a = 2; a <= N; a++) {
				dpArray[0][a] = Math.max(dpArray[1][a - 1], dpArray[1][a - 2]) + array[0][a];
				dpArray[1][a] = Math.max(dpArray[0][a - 1], dpArray[0][a - 2]) + array[1][a];
			}
			
			sb.append(Math.max(dpArray[0][N], dpArray[1][N])).append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
