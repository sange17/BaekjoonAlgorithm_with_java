package Graphs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Graphs_01967 {
	
	// node정보가 담긴 객체
	static class Node {
		int node, distance;
		
		public Node(int node, int distance) {
			this.node = node;
			this.distance = distance;
		}
	}
	
	static ArrayList<Node>[] list;
	static boolean[] visited;
	static int max = 0;		// 가장 큰 가중치가 담길 변수
	static int N;
	static int maxIdx = 0;	// 가장 큰 가중치가 담긴 idx번호를 담을 변수
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		
		// Node 연결 정보 객체를 담을 리스트 생성
		list = new ArrayList[N + 1];
		for(int i = 0; i <= N; i++) {
			list[i] = new ArrayList<>();
		}
		
		for(int i = 0; i < N - 1; i++) {
			st = new StringTokenizer(br.readLine());
			
			int parent = Integer.parseInt(st.nextToken());
			int child = Integer.parseInt(st.nextToken());
			int weight = Integer.parseInt(st.nextToken());
			
			// 부모 노드와 자식 노드 추가
			list[parent].add(new Node(child, weight));
			list[child].add(new Node(parent, weight));
		}
		
		// 트리는 사이클이 없고 두 노드 사이의 한 개의 경로를 가진 그래드라서
		// 트리의 양 끝 노드 사이의 최대 가중치 경로를 구한다.
		visited = new boolean[N + 1];
		visited[1] = true;
		dfs(1, 0);		// root node에서 탐색
		
		visited = new boolean[N + 1];
		visited[maxIdx] = true;
		dfs(maxIdx, 0);		// 가장 큰 가중치를 가지는 leaf node에서 다시 탐색
		
		System.out.println(max);
		br.close();
	}

	public static void dfs(int idx, int distance) {
		// 가장 큰 가중치와, 그 값을 가진 인덱스 갱신
		if(max < distance) {
			max = distance;
			maxIdx = idx;
		}
		
		// 한 node와 연결된 다른 노드들 탐색
		for(Node n : list[idx]) {
			if(!visited[n.node]) {
				visited[n.node] = true;
				dfs(n.node, distance + n.distance);
			}
		}
	}
}
