package Graphs;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Queue;

public class Graphs_02644 {
	static int n;
	static boolean[][] array;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int m = Integer.parseInt(br.readLine());
		
		array = new boolean[n+1][n+1];
		
		for(int i = 1; i <= m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			array[x][y] = array[y][x] = true;
		}
		
		System.out.println(bfs(a, b));
	}
	
	public static int bfs(int start, int end) {
		boolean[] visited = new boolean[n+1];
		Queue<Integer> q = new LinkedList<>();
		visited[start] = true;
		q.add(start);
		
		int answer = 0;
		while(!q.isEmpty()) {
			int size = q.size();
			for(int i = 0; i < size; i++) {
				int now = q.poll();
				if(now == end) return answer;
				for(int j = 1; j <= n; j++) {
					if(array[now][j] && !visited[j]) {
						visited[j] = true;
						q.add(j);
					}
				}
			}
			answer++;
		}
		return -1;
	}
}
