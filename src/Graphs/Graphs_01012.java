package Graphs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Graphs_01012 {
	static int[][] array;
	static boolean[][] visited;
	static int N, M, K;
	
	static int[] directRow = {-1, 1, 0, 0};
	static int[] directColumn = {0, 0, -1, 1};
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 0; t < T; t++) {
			st = new StringTokenizer(br.readLine(), " ");
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
						
			array = new int[M][N];
			visited = new boolean[M][N];
			int count = 0;
			
			for(int i = 0; i < K; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				
				array[b][a] = 1;
			}
			
			for(int i = 0; i < M; i++) {
				for(int j = 0; j < N; j++) {
					if(array[i][j] == 1 && !visited[i][j]) {
						dfs(i, j);
						count++;
					}					
				}
			}
			sb.append(count).append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}
	
	public static void dfs(int row, int column) {
		visited[row][column] = true;
		
		for(int i = 0; i < 4; i++) {
			int searchRow = row + directRow[i];
			int searchColumn = column + directColumn[i];
					
			if(searchRow >= 0 && searchColumn >= 0 && searchRow < M && searchColumn < N) {
				if(array[searchRow][searchColumn] == 1 && !visited[searchRow][searchColumn]) {
					dfs(searchRow, searchColumn);
				}
			}
		}
	}
}
