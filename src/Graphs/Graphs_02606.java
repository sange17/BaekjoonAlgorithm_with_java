package Graphs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Graphs_02606 {
	static int[][] array;
	static boolean[] check;
	static int count = 0;
	static int node = 0;
	static int line = 0;
	
	public static void dfs(int start) {
		check[start] = true;
		count++;
		
		for(int i = 0; i < node+1; i++) {
			if(array[start][i] == 1 && !check[i]) {
				dfs(i);
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		node = Integer.parseInt(br.readLine());
		line = Integer.parseInt(br.readLine());
		
		array = new int[node + 1][node + 1];
		check = new boolean[node+1];
		
		for(int i = 0; i < line; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			array[a][b] = array[b][a] = 1;
		}
		
		dfs(1);
		
		System.out.println(count-1);
		br.close();
	}
}
