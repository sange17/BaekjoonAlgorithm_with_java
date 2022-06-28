package Graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graphs_14502 {
	// 바이러스 객체
	static class virus{
		int x, y;
		
		virus(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
		
	static int N;								// 지도 세로
	static int M;								// 지도 가로
	static int[][] map;					// 지도
	static int[][] copy_map;		// 지도 복사
	
	// 상하좌우 좌표
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	
	static int result = Integer.MIN_VALUE;			// 안전지역
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		map = new int[N][M];
		copy_map = new int[N][M];
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		copy_map = map;			// 지도 카피
		
		DFS(0);								// 벽 세우면서 바이러스 퍼트리기
		
		System.out.println(result);
	}
	
	public static void DFS(int depth) {
		// 백 3개를 다 세웠으면 바이러스 퍼트리기
		if(depth == 3) {
			BFS();
			return;
		}
		
		// 벽 3개 못세웠으면 다시 세우기
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				// 빈칸이라면
				if(map[i][j] == 0) {
					// 벽 세우고
					map[i][j] = 1;
					DFS(depth + 1);
					// 다시 돌려놓기
					map[i][j] = 0;
				}
			}
		}
	}
	
	public static void BFS() {
		int[][] virus_map = new int[N][M];
		Queue<virus> queue = new LinkedList<virus>();
		
		// virus map 복사
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				virus_map[i][j] = map[i][j];
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0;  j < M; j++) {
				// 바이러스라면 큐에 넣는다.
				if(virus_map[i][j] == 2) {
					queue.add(new virus(i, j));
				}
			}
		}
		
		while(!queue.isEmpty()) {
			virus v = queue.remove();
			
			for(int d = 0; d < 4; d++) {
				int nowX = v.x + dx[d];
				int nowY = v.y + dy[d];
				
				// 범위 안에 있으면
				if(nowX >= 0 && nowY >=0 && nowX < N && nowY < M) {
					// 빈 칸이라면 바이러스 퍼뜨리고 다시 큐에 넣기
					if(virus_map[nowX][nowY] == 0) {
						virus_map[nowX][nowY] = 2;
						queue.add(new virus(nowX, nowY));
					}
				}
			}
		}
		safe(virus_map);
	}
	
	// 안전 영역 구하기
	public static void safe(int[][] virus_map) {
		int count = 0;
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(virus_map[i][j] == 0) count++;
			}
		}
		
		result = Math.max(count, result);
	}
	
}
