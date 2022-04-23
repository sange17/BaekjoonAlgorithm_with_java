package BruteForce;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class BruteForce_15650 {
	static int N, M;
	static int[] array;;
	static boolean[] visited;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		array = new int[M];
		visited = new boolean[N + 1];
		
		dfs(0, 0);
		System.out.println(sb);
	}
	
	public static void dfs(int depth, int start) {
		if(depth == M) {
			for(int i = 0; i < array.length; i++) {
				sb.append(array[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = start; i < N; i++) {
			if(!visited[i]) {
				visited[i] = true;
				array[depth] = i + 1;
				dfs(depth + 1, i + 1);
				visited[i] = false;
			}
		}
	}
}
