package Graphs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

//BFS(너비 우선 탐색을 이용하여 푼 문제)
public class Graphs_16236 {
	static int[] dy = {-1, 0, 0, 1};
	static int[] dx = {0, -1, 1, 0};
	static int[][] map;		// 바다 좌표 이차원 배열
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());	// map의 가로, 세로 크기
		map = new int[N][N];
		int[] cur = null;
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if(map[i][j] == 9) {
					cur = new int[] {i,j};
					map[i][j] = 0;
				}
			}
		}
		
		int size = 2;		// 아기상어의 처음 크기
		int eat = 0;		// 먹은 물고기 수
		int move = 0;		// 총 이동거리
		
		while(true) {
			PriorityQueue<int[]> que = new PriorityQueue<int[]>((o1, o2) ->
				o1[2] != o2[2] ? Integer.compare(o1[2], o2[2]) : 
					(o1[0] != o2[0] ? Integer.compare(o1[0], o2[0]) : Integer.compare(o1[1], o2[1]))
			);
			boolean[][] visited = new boolean[N][N];
			
			que.add(new int[] {cur[0], cur[1], 0});		// y좌표, x좌표, 이동거리
			visited[cur[0]][cur[1]] = true;
			
			boolean check = false;		// 아기상어가 먹이를 먹었는지 체크
			
			while(!que.isEmpty()) {
				cur = que.poll();
				
				// 먹이가 있으면서 아기 상어보다 크기가 작은 물고기라면
				if(map[cur[0]][cur[1]] != 0 && map[cur[0]][cur[1]] < size) {
					map[cur[0]][cur[1]] = 0;		// 먹힌 물고기 제거
					eat++;		// 먹은 물고기 수 증가
					move += cur[2];		// 이동거리를 총 이동거리에 추가
					check = true;		// 먹이를 먹었으므로 체크
					break;
				}
				
				for(int i = 0; i < 4; i++) {
					int nowy = cur[0] + dy[i];
					int nowx = cur[1] + dx[i];
					
					if(nowy < 0 || nowy >= N || nowx < 0 || nowx >= N 
							|| visited[nowy][nowx] || map[nowy][nowx] > size)
						continue;
					
					que.add(new int[] {nowy, nowx, cur[2] + 1});
					visited[nowy][nowx] = true;
				}
			}
			
			// 큐가 비워질 때까지 먹이를 먹은 적이 없다면, 더 이상 먹은 물고기가 없는 것이므로 중단
			if(!check)
				break;
			
			// 아기상어의 크기와 먹이를 먹은 수가 동일하면 아기상어 크기 증가
			if(size == eat) {
				size++;		// 아기상어 크기 증가
				eat = 0;	// 먹은 물고기 0으로 초기화
			}
		}
		
		System.out.println(move);
		br.close();
	}
}
