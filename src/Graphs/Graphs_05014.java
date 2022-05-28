package Graphs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Graphs_05014 {
	static int visited[];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int f = Integer.parseInt(st.nextToken());	// 최고층
		int s = Integer.parseInt(st.nextToken());	// 강호 위치
		int g = Integer.parseInt(st.nextToken());	// 목적지
		int u = Integer.parseInt(st.nextToken());	// 업
		int d = Integer.parseInt(st.nextToken());	// 다운
		
		visited = new int[f+1];
		
		bfs(f,s,g,u,d);
		
		br.close();
	}
	
	public static void bfs(int f, int s, int g, int u, int d) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(s);
		visited[s] = 1;
		
		while(!q.isEmpty()) {
			int current = q.poll();	// 현재 위치
			
			// 가야할 층 도착 시
			if(current == g) {
				// 버튼 누른 횟수 출력.
				System.out.println(visited[current] - 1);
			}
			
			// 업
			if(current+u <= f && visited[current+u] == 0) {
				// 올라간 층에 이전에 버튼 누른 횟수 +1
				visited[current+u] = visited[current] + 1;
				q.add(current+u);
			}
			
			// 다운
			if(current-d > 0 && visited[current-d] == 0) {
				// 내려간 층에 이전에 버튼 누른 횟수 +1
				visited[current-d] = visited[current] + 1;
				q.add(current-d);
			}
		}
		
		if(visited[g] == 0) {
			System.out.println("use the stairs");
		}
	}
}
