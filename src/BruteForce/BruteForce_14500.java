package BruteForce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BruteForce_14500 {
	static int max = Integer.MIN_VALUE;
	static int[][] array;
	static boolean[][] visited;
	static int N , M;
	
	// 상하좌우 탐색 좌표
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		array = new int[N][M];
		visited = new boolean[N][M];
		
		// 이차원 배열에 수들 입력하기
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) {
				array[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// 전체 탐색
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				visited[i][j] = true;
				dfs(i, j, array[i][j], 1);
				visited[i][j] = false;
			}
		}
		System.out.println(max);
	}

	public static void dfs(int row, int column, int sum, int count) {
		
		// 테트로미노 완성시(count == 4) 수들의 합 갱신
		if(count == 4) {
			max = Math.max(max, sum);
			return;
		}
		
		// 현재 좌표에서 상하좌우 탐색
		for(int i = 0; i < 4; i++) {
			int curRow = row + dx[i];
			int curCol = column + dy[i];
			
			// 범위 벗어나면 예외 처리
			if(curRow < 0 || curRow >= N || curCol < 0 || curCol >= M) continue;
			
			// 아직 방문하지 않은 곳이라면
			if(!visited[curRow][curCol]) {
				
				// 'ㅗ' 모양 테트로미노를 만들기 위해 count가 2일 때의 칸에서 탐색 한번 더 진행
				if(count == 2) {
					visited[curRow][curCol] = true;
					dfs(row, column, sum + array[curRow][curCol], count + 1);
					visited[curRow][curCol] = false;
				}
				
				// 'ㅗ' 모양 테트로미노를 제외한 나머지를 만들기 위해 진행
				visited[curRow][curCol] = true;
				dfs(curRow, curCol, sum + array[curRow][curCol], count + 1);
				visited[curRow][curCol] = false;
				
			}
		}
	}
}
