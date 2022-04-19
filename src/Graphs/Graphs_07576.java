package Graphs;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Graphs_07576 {
	static int N, M;
	static int[][] array;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static Queue<int[]> que = new LinkedList<>();
	static int count, days;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		
		array = new int[N][M];
		count = 0;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < M; j++) {
				array[i][j] = Integer.parseInt(st.nextToken());
				if(array[i][j] == 1)
					que.add(new int[] {i, j});
				else if(array[i][j] == 0)
					count++;
			}
		}
		
		days = 0;
		System.out.println(bfs());
		br.close();
	}
	
	public static int bfs() {
		while(count > 0 && !que.isEmpty()) {
			for(int i = que.size(); i > 0; i--) {
				int[] now = que.poll();
				
				for(int j = 0; j < 4; j++) {
					int ny = now[0] + dy[j];
					int nx = now[1] + dx[j];
					
					if(nx < 0 || ny < 0 || nx >= M || ny >= N || array[ny][nx] != 0) continue;
					
					count--;
					array[ny][nx] = 1;
					que.add(new int[] {ny, nx});
				}
			}
			days++;
		}
		return count == 0 ? days : -1;
	}
}
