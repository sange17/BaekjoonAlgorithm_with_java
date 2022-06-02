package Graphs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;

public class Graphs_02583 {
	static int M, N, K, count;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int[][] map;
	static ArrayList<Integer> List;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		M = Integer.parseInt(st.nextToken());	// 높이
		N = Integer.parseInt(st.nextToken());	// 너비
		K = Integer.parseInt(st.nextToken());	// 직사각형 개수
		map = new int[M][N];
		
		for(int i = 0; i < K; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int px1 = Integer.parseInt(st.nextToken());
			int py1 = Integer.parseInt(st.nextToken());
			int px2 = Integer.parseInt(st.nextToken());
			int py2 = Integer.parseInt(st.nextToken());
			
			for(int py = py1; py < py2; py++) {
				for(int px = px1; px < px2; px++) {
					map[py][px] = 1;
				}
			}
		}
		
		List = new ArrayList<Integer>();
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				if(map[i][j] == 0) {
					count = 0;
					dfs(i, j);
					List.add(count);
				}
			}
		}
		
		sb.append(List.size()).append("\n");
		
		Collections.sort(List);
		
		for(Integer i : List) sb.append(i).append(" ");
		
		System.out.println(sb);
	}
	
	static void dfs(int x, int y) {
		map[x][y] = 1;
		count++;
		
		for(int i = 0; i < 4; i++) {
			int nowX = dx[i] + x;
			int nowY = dy[i] + y;
			
			if(nowX >= 0 && nowY >= 0 && nowX < M && nowY < N) {
				if(map[nowX][nowY] == 0) dfs(nowX, nowY);
			}
		}
		
		
	}
}
