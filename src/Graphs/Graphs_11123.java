package Graphs;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Graphs_11123 {
	static int X, Y;
	static char[][] map;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		for(int t = 0; t < T; t++) {
			st = new StringTokenizer(br.readLine());
			X = Integer.parseInt(st.nextToken());
			Y = Integer.parseInt(st.nextToken());
			
			map = new char[X][Y];
			for(int i = 0; i < X; i++) {
				String str = br.readLine();
				for(int j = 0; j < Y; j++) {
					map[i][j] = str.charAt(j);
				}
			}
			
			int count = 0;
			
			for(int i = 0; i < X; i++) {
				for(int j = 0; j < Y; j++) {
					if(map[i][j] == '#') {
						count++;
						bfs(i, j);
					}
				}
			}
			
			sb.append(count + "\n");
		}
		System.out.println(sb);
	}
	
	static class Point{
		int x, y;
		
		public Point(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
	}
	
	public static void bfs(int x, int y) {
		Queue<Point> queue = new LinkedList<>();
		queue.offer(new Point(x, y));
		map[x][y] = '.';
		
		while(!queue.isEmpty()  ) {
			Point now = queue.poll();
			
			for(int i = 0; i < 4; i++) {
				int nowX = now.x + dx[i];
				int nowY = now.y + dy[i];
				
				if(nowX < 0 || nowY < 0 
						|| nowX >= X || nowY >= Y 
						|| map[nowX][nowY] == '.') continue;
				queue.offer(new Point(nowX, nowY));
				map[nowX][nowY] = '.';
			}
		}
	}
}
