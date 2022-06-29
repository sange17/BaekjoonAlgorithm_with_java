package Graphs;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Graphs_13565 {
	static int M, N;
	static int[][] map;
	static boolean[][] visited;
	static boolean check = false;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		M = Integer.parseInt(st.nextToken());		// 행
		N = Integer.parseInt(st.nextToken());		// 열
		map = new int[M][N];
		
		// 이차원 배열에 0, 1 담기
		for(int i = 0; i < M; i++) {
			String str = br.readLine();
			for(int j = 0; j < N; j++) {
				map[i][j] = str.charAt(j) - '0';
			}
		}
		
		for(int i = 0; i < N; i++) {
			if(check == true) break;
			if(map[0][i] == 0) {
				visited = new boolean[M][N];
				visited[0][i] = true;
				dfs(0, i);
			}
		}
		
		if(check == true) 
			System.out.println("YES");
		else 
			System.out.println("NO");
	}

	private static void dfs(int x, int y) {
		if(x == (M - 1)) {
			check = true;
			return;
		}
		
		for(int i = 0; i < 4; i++) {
			int nowX = x + dx[i];
			int nowY = y + dy[i];
			if(nowX < 0 || nowY < 0 || nowX >= M || nowY >= N) continue;
			if(map[nowX][nowY] == 0 && !visited[nowX][nowY]) {
				visited[nowX][nowY] = true;
				dfs(nowX, nowY);
			}
		}
	}
}


