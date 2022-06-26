package Graphs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Graphs_02468 {
	static int N;
	static int[][] map;
	static boolean[][] checked;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		map = new int[N][N];
		
		StringTokenizer st;
		int maxHeight = 0;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if(map[i][j] > maxHeight) {
					maxHeight = map[i][j];
				}
			}
		}
		
		int maxResult = 0;
		for(int h = 0; h < maxHeight + 1; h++) {
			checked = new boolean[N][N];
			int count = 0;
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					if(!checked[i][j] && map[i][j] > h) {
						count += dfs(i, j, h);
					}
				}
			}
			maxResult = Math.max(maxResult,  count);
		}
		
		System.out.println(maxResult);
	}
	
	static int dfs(int x, int y, int height) {
		checked[x][y] = true;
		
		for(int i = 0; i < 4; i++) {
			int nowX = x + dx[i];
			int nowY = y + dy[i];
			
			if(nowX < 0 || nowY < 0 || nowX > N - 1 || nowY > N - 1) continue;
			if(checked[nowX][nowY]) continue;
			if(map[nowX][nowY] > height) {
				dfs(nowX, nowY, height);
			}
		}
		return 1;
	}
}
