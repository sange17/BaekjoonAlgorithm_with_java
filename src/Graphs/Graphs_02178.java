package Graphs;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Queue;

public class Graphs_02178 {
	static int N, M;
	static int[][] map;
	static boolean[][] visited;
	static int[] directX = {-1, 1, 0, 0};
	static int[] directY = {0, 0, -1, 1};
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int[N][M];
		visited = new boolean[N][M];
		
		for(int i = 0; i < N; i++) {
			String[] line = br.readLine().split("");
			for(int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(line[j]);
			}
		}
		
		bfs(0,0);
		
		System.out.println(map[N-1][M-1]);
		br.close();
	}
	
	public static void bfs(int x, int y) {
		visited[0][0] = true;
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {x,y});
		
		while(!que.isEmpty()) {
			int now[] = que.poll();
			int nowX = now[0];
			int nowY = now[1];
			
			for(int i = 0; i < 4; i++) {
				int nextX = nowX + directX[i];
				int nextY = nowY + directY[i];
				
				if(nextX < 0 || nextY < 0 || nextX >= N || nextY >= M)
					continue;
				if(visited[nextX][nextY] || map[nextX][nextY] == 0)
					continue;
				
				que.add(new int[] {nextX, nextY});
				map[nextX][nextY] = map[nowX][nowY] + 1;
				visited[nextX][nextY] = true;
			}
		}
	}
}
