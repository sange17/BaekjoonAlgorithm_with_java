package BruteForce;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BruteForce_07568 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int array[][] = new int[n][2];
		
		StringTokenizer st;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int weight = Integer.parseInt(st.nextToken());
			int length = Integer.parseInt(st.nextToken());
			
			array[i][0] = weight;
			array[i][1] = length;
		}
		
		for(int i = 0; i < n; i++) {
			int rank = 1;
			for(int j = 0; j < n; j++) {
				if(array[i][0] < array[j][0] && array[i][1] < array[j][1]) {
					rank++;
				}
			}
			sb.append(rank).append(" ");
		}
		System.out.print(sb);
		br.close();
	}
}
