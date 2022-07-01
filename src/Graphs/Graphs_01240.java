/*
 * 1240 노드사이의 거리
 * 
 * dfs로 푼 문제
 * 
 */



package Graphs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Graphs_01240 {
	
	static class Node{
		int to;
		int cost;
		
		public Node(int to, int cost) {
			this.to = to;
			this.cost = cost;
		}
	}
	static int answer;
	static List<Node>[] list;
	static int[] cost;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		list = new ArrayList[n+1];
		cost = new int[n+1];
		for(int i = 1; i < n+1; i++) {
			list[i] = new ArrayList<>();
		}
		
		for(int i = 0; i < n-1; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int u = Integer.parseInt(st.nextToken());	// 노드1
			int v = Integer.parseInt(st.nextToken());	// 노드2
			int w = Integer.parseInt(st.nextToken());	// 거리
			list[u].add(new Node(v,w));
			list[v].add(new Node(u,w));
		}
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int to = Integer.parseInt(st.nextToken());
			int from = Integer.parseInt(st.nextToken());
			dfs(to, -1, from, 0);
			sb.append(answer).append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}

	private static void dfs(int to, int i, int from, int cost) {
		if(to == from) {
			answer = cost;
		}
		
		for(Node next : list[to]) {
			if(next.to != i) {
				dfs(next.to, to, from, cost + next.cost);
			}
		}
	}
	
	
}
