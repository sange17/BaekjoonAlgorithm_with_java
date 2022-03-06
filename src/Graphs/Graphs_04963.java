package Graphs;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Graphs_04963 {
	static int[][] array;
	static boolean[][] visited;
	static int w, h;
	
	static int[] directRow = {-1, 1, 0, 0, -1 , 1, -1, 1};
	static int[] directColumn = {0, 0, -1, 1, -1, 1, 1, -1};
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int count = 0;
			
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
			
			if(w == 0 || h == 0) {
				break;
			}
			
			array = new int[h][w];
			visited = new boolean[h][w];
			
			if(w == 1 && h > 1) {
				for(int i = 0; i < h; i++) {
					array[i][0] = Integer.parseInt(br.readLine());
				}
			}
			else if(w > 1 && h == 1) {
				st = new StringTokenizer(br.readLine(), " ");
				for(int i = 0; i < st.countTokens(); i++) {
					array[0][i] = Integer.parseInt(st.nextToken());
				}
			}
			else if(w > 1 && h > 1) {
				for(int i = 0; i < h; i++) {
					st = new StringTokenizer(br.readLine(), " ");
					for(int j = 0; j < w; j++) {
						array[i][j] = Integer.parseInt(st.nextToken());
					}
				}				
			}
			else {
				array[0][0] = Integer.parseInt(br.readLine());
			}
			
			for(int i = 0; i < h; i++) {
				for(int j = 0; j < w; j++) {
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
		
		for(int i = 0; i < 8; i++) {
			int searchRow = row + directRow[i];
			int searchColumn = column + directColumn[i];
			
			if(searchRow >= 0 && searchColumn >= 0 && searchRow < h && searchColumn < w) {
				if(array[searchRow][searchColumn] == 1 && !visited[searchRow][searchColumn]) {
					dfs(searchRow, searchColumn);
				}
			}
		}
	}
}
