package Graphs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Graphs_01389 {
	public static int N, M;
	public static int[][] map;
	// MAX_VALUE(2147483647)를 사용할 시 출력이 다른 값으로 나옵니다.
	// static final int INF = Integer.MAX_VALUE;
	static final int INF = 999999999;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int[N + 1][N + 1];
		
		// map 이차원 배열에 초기값 저장
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N; j++) {
				map[i][j] = INF;
				if(i == j) {
					map[i][j] = 0;
				}
			}
		}
		
		// 친구 관계 표시(A -> B == B -> A)
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			map[x][y] = map[y][x] = 1;
		}
		
		// 플로이드 와샬 로직(모든 정점이 모든 정점으로 가는 최단 경로를 구하는 경우)
		// 거쳐가는 노드
		for(int k = 1; k <= N; k++) {
			// 출발 노드
			for(int i = 1; i <= N; i++) {
				// 도착 노드
				for(int j = 1; j <= N; j++) {
					if(map[i][j] > map[i][k] + map[k][j]) {
						map[i][j] = map[i][k] + map[k][j];
					}
				}
			}
		}
		
		int min = INF;
		int idx = -1;
		
		// 케빈 베이컨의 수가 가장 작은 인덱스 탐색
		// 그런 인덱스가 여러 개인 경우 가장 작은 인덱스 출력
		for(int i = 1; i <= N; i++) {
			int count = 0;
			
			for(int j = 1; j <= N; j++) {
				count += map[i][j];
			}
			
			// 케빈 베이컨의 수 중에 최소값을 구하고 인덱스를 최신화.
			if(min > count) {
				min = count;
				idx = i;
			}
		}
		
		System.out.println(idx);
	}
}
