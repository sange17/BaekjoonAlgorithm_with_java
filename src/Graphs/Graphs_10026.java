package Graphs;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Graphs_10026 {
	static int N;
	static String str;
	static char[][] map;
	static boolean[][] visited;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		map = new char[N + 1][N + 1];
		visited = new boolean[N + 1][N + 1];
		
		// 입력된 색상 값들을 2차원 배열에 저장
		for(int i = 0; i < N; i++) {
			str = br.readLine();
			for(int j = 0; j < N; j++) {
				map[i][j] = str.charAt(j);
			}
		}
		
		// 적록색맹이 아닌 경우
		int count = 0;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(!visited[i][j]) {
					dfs(i,j);
					count++;
				}
			}
		}
		
		int notColorBlindness = count;			// 적록색맹이 아닌 사람이 본 구역의 개수
		count = 0;								// 적록색맹인 경우 실행 전 개수 카운트 초기화
		visited = new boolean[N + 1][N + 1];	// 적록색맹인 경우 실행 전 방문 배열 초기화
		
		// 적록색맹인 경우 map의 G구역을 R로 바꾼 후 dfs를 실행한다.
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(map[i][j] == 'G') {
					map[i][j] = 'R';
				}
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(!visited[i][j]) {
					dfs(i, j);
					count++;
				}
			}
		}
		
		int colorBlindness = count;				// 적록색맹인 사람이 본 구역의 개수
		
		System.out.println(notColorBlindness + " " + colorBlindness);
	}
	
	static void dfs(int x, int y) {
		visited[x][y] = true;
		char nowColor = map[x][y];
		for(int i = 0; i < 4; i++) {
			int nowX = x + dx[i];
			int nowY = y + dy[i];
			
			// map 영역을 벗어난 값은 다음 반복으로 넘어가기
			if(nowX < 0 || nowY < 0 || nowX > N || nowY > N) continue;
			
			if(!visited[nowX][nowY] && map[nowX][nowY] == nowColor) dfs(nowX, nowY);
		}
	}
}
