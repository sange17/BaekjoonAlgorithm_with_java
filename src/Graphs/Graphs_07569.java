package Graphs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Queue;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Graphs_07569 {
	static int[] dx = {0, 0, 0, 0, -1, 1};
	static int[] dy = {0, 0, -1, 1, 0, 0};
	static int[] dz = {-1, 1, 0, 0, 0, 0};
	
	static int H, N, M;
	static int[][][] array;
	
	static int count, days;
	static Queue<int[]> que = new LinkedList<>();
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());
		
		array= new int[H][N][M];
		count = 0;
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < N; j++) {
				st = new StringTokenizer(br.readLine(), " ");
				for(int k = 0; k < M; k++) {
					array[i][j][k] = Integer.parseInt(st.nextToken());
					if(array[i][j][k] == 1)
						que.add(new int[] {i, j, k});
					else if(array[i][j][k] == 0)
						count++;
				}
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
				
				for(int j = 0; j < 6; j++) {
					int nz = now[0] + dz[j];
					int ny = now[1] + dy[j];
					int nx = now[2] + dx[j];
					
					if(nz < 0 || ny < 0 || nx < 0 || nz >= H || ny >= N || nx >= M || array[nz][ny][nx] != 0)
						continue;
					
					count--;
					array[nz][ny][nx] = 1;
					que.add(new int[] {nz, ny, nx} );
				}
			}
			days++;
		}
		return count == 0 ? days : -1;
	}
}
