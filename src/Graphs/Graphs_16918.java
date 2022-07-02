package Graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Graphs_16918 {
	
	
	static int R, C, N;
	static char[][] map;
	static int[][] burstTime;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int time = 1;
	static Queue<Point> que = new LinkedList<>();
	
	
	
	static class Point {
		int x,y;
		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		R = sc.nextInt();
		C = sc.nextInt();
		N = sc.nextInt();
		
		map = new char[R][C];
		burstTime = new int[R][C];
		
		// 맵 배열에 데이터 넣기
		for(int i = 0; i < R; i++) {
			String str = sc.next();
			for(int j = 0; j < C; j++) {
				map[i][j] = str.charAt(j);
				if(map[i][j] == 'O') {
					que.add(new Point(i, j));
					burstTime[i][j] = 3;		// 폭탄이 터지기까지 3초 남음
				}
			}
		}
		
		while(time++ < N) {
			if(time % 2 == 0) {
				setBomb();
			}else {
				getBomb();
			}
		}
		
		printResult();
	}

	private static void printResult() {
		for(int i = 0; i < R; i++) {
			for(int j = 0; j < C; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}

	private static void getBomb() {
		for(int i = 0; i < R; i++) {
			for(int j = 0; j < C; j++) {
				if(burstTime[i][j] == time) {
					bomb(i, j);
				}
			}
		}
	}

	private static void bomb(int x, int y) {
		map[x][y] = '.';
		
		for(int i = 0; i < 4; i++) {
			int nowX = x + dx[i];
			int nowY = y + dy[i];
			
			if(mapBoundary(nowX, nowY) && map[nowX][nowY] == 'O' && 
					burstTime[nowX][nowY] != time) {
				burstTime[nowX][nowY] = 0;
				map[nowX][nowY] = '.';
			}
		}
	}

	private static boolean mapBoundary(int nX, int nY) {
		if(nX >= 0 && nY >= 0 && nX < R && nY < C) 
			return true;
		
		return false;
	}

	private static void setBomb() {
		for(int i = 0; i < R; i++) {
			for(int j = 0; j < C; j++) {
				if(map[i][j] == '.') {
					map[i][j] = 'O';
					burstTime[i][j] = time + 3;
				}
			}
		}
	}
	
}
