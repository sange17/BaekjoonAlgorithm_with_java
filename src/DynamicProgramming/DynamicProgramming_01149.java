package DynamicProgramming;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class DynamicProgramming_01149 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[][] dpArray = new int[N+1][3];
		
		StringTokenizer st;
		for(int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int RED = Integer.parseInt(st.nextToken());
			int GREEN = Integer.parseInt(st.nextToken());
			int BLUE = Integer.parseInt(st.nextToken());
			
			dpArray[i][0] = Math.min(dpArray[i-1][1], dpArray[i-1][2]) + RED;
			dpArray[i][1] = Math.min(dpArray[i-1][0], dpArray[i-1][2]) + GREEN;
			dpArray[i][2] = Math.min(dpArray[i-1][0], dpArray[i-1][1]) + BLUE;
		}
		
		System.out.println(Math.min(dpArray[N][0], Math.min(dpArray[N][1], dpArray[N][2])));
	}
}
