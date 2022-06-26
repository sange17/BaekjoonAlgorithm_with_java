package Graphs;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Graphs_01058 {
	static int INF = 100000000;
	static int[][] friend = new int[51][51];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= n; i++) {
			char[] str = br.readLine().toCharArray();
			for(int j = 1; j <= n; j++) {
				if(i == j) continue;
				
				friend[i][j] = str[j-1] == 'Y' ? 1 : INF;
			}
		}
		
		for(int k = 1; k <= n; k++) {
			for(int i = 1; i <= n; i++) {
				for(int j = 1; j <= n; j++) {
					if(i == j) continue;
					
					friend[i][j] = Math.min(friend[i][j], friend[i][k] + friend[k][j]);
				}
			}
		}
		
		int max = 0;
		for(int i = 1; i <= n; i++) {
			int count = 0 ;
			
			for(int j = 1; j <= n; j++) {
				if(friend[i][j] == 2 || friend[i][j] == 1) count++;
			}
			
			max = Math.max(max, count);
		}
		
		
		System.out.println(max);
	}
}
