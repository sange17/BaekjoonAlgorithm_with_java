package Graphs;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Queue;

public class Graphs_01260 {
	
	static int[][] array;
	static boolean[] dfsCheck;
	static boolean[] bfsCheck;
	static int node = 0;
	static int line = 0;
	static int start = 0;
	
	public static void dfs(int start) {
		dfsCheck[start] = true;
		System.out.print(start + " ");
		
		for(int i = 0; i < node + 1; i++) {
			if(array[start][i] == 1 && !dfsCheck[i]) {
				dfs(i);
			}
		}
	}
	
	public static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(start);
		bfsCheck[start] = true;
		
		while(!queue.isEmpty()) {
			int a = queue.poll();
			System.out.print(a + " ");
			for(int i = 1; i < node + 1; i++) {
				if(array[a][i] == 1 && !bfsCheck[i]) {
					bfsCheck[i] = true;
					queue.add(i);
				}
			}			
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		node = Integer.parseInt(st.nextToken());
		line = Integer.parseInt(st.nextToken());
		start = Integer.parseInt(st.nextToken());
		
		array = new int[node + 1][node + 1];
		dfsCheck = new boolean[node+1];
		bfsCheck = new boolean[node+1];
		
		for(int i = 0; i < line; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			array[a][b] = array[b][a] = 1;
		}
		
		dfs(start);
		System.out.println();
		bfs(start);
		
		br.close();
	}
}
