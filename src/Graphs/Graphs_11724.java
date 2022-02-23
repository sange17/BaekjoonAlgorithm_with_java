package Graphs;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Graphs_11724 {
	static int[][] array;
	static boolean[] visited;
	static int N;
	static int M;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		array = new int[N + 1][N + 1];
		visited = new boolean[N + 1];
		int count = 0;
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			array[a][b] = array[b][a] = 1;
		}
		
		for(int i = 1; i < N + 1; i++) {
			if(!visited[i]) {
				dfs(i);
				count++;
			}
		}
		System.out.println(count);
		br.close();
	}
	
	public static void dfs(int start) {
		visited[start] = true;
		
		for(int i = 1; i < N + 1; i++) {
			if(array[start][i] == 1 && !visited[i]) {
				dfs(i);
			}
		}
	}
}
