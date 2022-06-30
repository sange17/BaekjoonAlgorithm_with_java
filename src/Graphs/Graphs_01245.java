package Graphs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Graphs_01245 {
	static int col, row;
	static int[][] map;
	static boolean[][] visited;
	static boolean check;
	static int[] dx = {-1 ,1, 0, 0, 1, 1, -1, -1};
	static int[] dy = {0, 0, -1, 1, 1, -1, 1, -1};

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		col = Integer.parseInt(st.nextToken());
		row = Integer.parseInt(st.nextToken());
		
		map = new int[col][row];
		visited = new boolean[col][row];
		
		for(int i = 0; i < col; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < row; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int count = 0;
		for(int i = 0; i < col; i++) {
			for(int j = 0; j < row; j++) {
				if(!visited[i][j]) {
					check = true;
					dfs(i, j);
					if(check) count++;
				}
			}
		}
		
		System.out.println(count);
		br.close();
		
	}

	private static void dfs(int x, int y) {
		visited[x][y] = true;
		for(int i = 0; i < 8; i++) {
			int nowX = x + dx[i];
			int nowY = y + dy[i];
			
			if(nowX < 0 || nowY < 0 || nowX >= col || nowY >= row) continue;
			
			if(map[nowX][nowY] > map[x][y]) check = false;
			if(!visited[nowX][nowY] && map[nowX][nowY] == map[x][y])
				dfs(nowX, nowY);
				
		}
	}
}
