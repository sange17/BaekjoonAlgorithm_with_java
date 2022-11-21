package Graphs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Graphs_09372 {
	static int N, M;
	static int[][] array;
	static boolean[] visited;
	static int result;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			N = Integer.parseInt(st.nextToken());	// 국가의 수
			M = Integer.parseInt(st.nextToken());	// 비행기의 수
			array = new int[N+1][N+1];
			visited = new boolean[N+1];
			result = 0;
			
			for(int j = 0; j < M; j++) {
				st = new StringTokenizer(br.readLine(), " ");
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				
				array[a][b] = array[b][a] = 1;		// 국가 사이의 비행기 경로가 있음을 표시
			}
			
			bfs();
			System.out.println(result - 1);			// 방문한 국가 사이의 경로의 수를 출력한다.
			
		}
	}
	
	public static void bfs() {
		
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(1);
		visited[1] = true;
		
		int value = 0;
		while(!queue.isEmpty()) {
			result++;
			value = queue.poll();
			for(int i = 1; i <= N; i++) {
				// 방문할 수 있는 국가가 존재하고 방문하지 않았으면
				if(array[value][i] != 0 && !visited[i]) {
					visited[i] = true;		// 방문 확인
					queue.add(i);			// 방문한 나라 추가
				}
			}
		}
	}
}
