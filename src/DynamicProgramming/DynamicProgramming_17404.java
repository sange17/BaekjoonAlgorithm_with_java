package DynamicProgramming;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class DynamicProgramming_17404 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int MAXINF = 1000*1000+1;
		int N = Integer.parseInt(br.readLine());
		int[][] RGB = new int[N+1][3];
		int[][] dpArray = new int[N+1][3];
		int min = MAXINF;
		
		StringTokenizer st;
		for(int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < 3; j++) {
				RGB[i][j] = Integer.parseInt(st.nextToken());				
			}
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(i == j) {
					dpArray[1][j] = RGB[1][j];
				}else {
					dpArray[1][j] = MAXINF;
				}
			}
			
			for(int j = 2; j <= N; j++) {
				dpArray[j][0] = RGB[j][0] + Math.min(dpArray[j-1][1], dpArray[j-1][2]);
				dpArray[j][1] = RGB[j][1] + Math.min(dpArray[j-1][0], dpArray[j-1][2]);
				dpArray[j][2] = RGB[j][2] + Math.min(dpArray[j-1][0], dpArray[j-1][1]);
			}
			
			for(int j = 0; j < 3; j++) {
				if(i != j && min > dpArray[N][j]) {
					min = dpArray[N][j];
				}
			}
		}
		System.out.println(min);
		br.close();
	}
}
