package DynamicProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class DynamicProgramming_16964 {
	static int N;
	static int[][] array;
	static int[] vArray;
	static boolean[] visited;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		array = new int[N+1][N+1];
		vArray = new int[N+1];
		visited = new boolean[N+1];
		int[] vArray = new int[N];
		
		StringTokenizer st;
		for(int i = 0; i < N - 1; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			array[a][b] = array[a][b] = 1;
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 1; i <= N; i++) {
			vArray[i] = Integer.parseInt(st.nextToken());
		}
		
		dfs(1);
		
		
		br.close();
	}
	
	public static void dfs(int x) {
		if(visited[x] == true) return;
		
		visited[x] = true;
		
		for(int i = 1; i <= N; i++) {
			if(visited[vArray[i]] == false) {
				
				dfs(vArray[i]);
			}
		}
	}
}
