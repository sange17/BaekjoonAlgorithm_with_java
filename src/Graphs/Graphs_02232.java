package Graphs;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class Graphs_02232 {
	static boolean[][] visited;
	static char[][] map;
	static int R, C;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int sheep = 0;
	static int wolf = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		R = sc.nextInt();
		C = sc.nextInt();
		
		map = new char[R][C];
		visited = new boolean[R][C];
		
		for(int i = 0; i < R; i++) {
			String line = sc.next();
			for(int j = 0; j < C; j++) {
				map[i][j] = line.charAt(j);
			}
		}
		
		for(int i = 0; i < R; i++) {
			for(int j = 0; j < C; j++) {
				if(!visited[i][j] && map[i][j] != '#') {
					bfs(new Point(i, j));
				}
			}
		}
		System.out.println(sheep + " " + wolf);
	}
	
	
	static void bfs(Point point) {
		Queue<Point> queue = new LinkedList<>();
		queue.offer(point);
		visited[point.r][point.c] = true;
		int sheepCount = 0;
		int wolfCount = 0;
		
		while(!queue.isEmpty()) {
			Point point_2 = queue.poll();
			int r = point_2.r;
			int c = point_2.c;
			
			if(map[r][c] == 'k') {
				sheepCount++;
			}else if(map[r][c] == 'v') {
				wolfCount++;
			}
			
			for(int i = 0; i < 4; i++) {
				int r_2 = point_2.r + dx[i];
				int c_2 = point_2.c + dy[i];
				
				if((r_2 > 0 && r_2 < R && c_2 > 0 && c_2 < C) 
						&& !visited[r_2][c_2] && map[r_2][c_2] != '#') {
					visited[r_2][c_2] = true;
					queue.offer(new Point(r_2, c_2));
				}
			}
		}
		
		if(sheepCount > wolfCount) {
			sheep += sheepCount;
		}else {
			wolf += wolfCount;
		}
	}
	
	static class Point {
		int r;
		int c;
		
		Point(int r, int c) {
			this.r = r;
			this.c = c;
		}
	}
}
