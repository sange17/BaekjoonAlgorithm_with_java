package Graphs;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Graphs_01068 {
	static int N, delete;
	static int[] parent;
	static int count;
	static boolean[] visited;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		parent = new int[N];
		int root = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i < N; i++) {
			parent[i] = Integer.parseInt(st.nextToken());
			if(parent[i] == -1) root = i;
		}
		delete = Integer.parseInt(br.readLine());
		
		deleteNode(delete);
		
		count = 0;
		visited = new boolean[N];
		countLeaf(root);
		
		System.out.println(count);
		br.close();
	}
	
	public static void deleteNode(int d) {
		parent[d] = -2;
		for(int i = 0; i < N; i++) {
			if(parent[i] == d) {
				deleteNode(i);
			}
		}
	}
	
	public static void countLeaf(int s) {
		boolean isLeaf = true;
		visited[s] = true;
		if(parent[s] != -2) {
			for(int i = 0; i < N; i++) {
				if(parent[i] == s && visited[i] == false) {
					countLeaf(i);
					isLeaf = false;
				}
			}
			if(isLeaf) count++;
		}
	}
}
