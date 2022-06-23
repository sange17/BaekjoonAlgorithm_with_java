package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graphs_01707 {
	static int K, V, E;
	static String answer;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] set;
	
	public static void main(String[] args) {
		int point1, point2;
		
		Scanner sc = new Scanner(System.in);
		
		K = sc.nextInt();
		
		while(K != 0) {
			answer = "YES";
			V = sc.nextInt();
			E = sc.nextInt();
			
			graph = new ArrayList<>();
			
			for(int i = 0; i < V; i++) {
				graph.add(new ArrayList<>());
			}
			
			for(int i = 0; i < E; i++) {
				point1 = sc.nextInt() - 1;
				point2 = sc.nextInt() - 1;
				
				// 쌍으로 서로 연결되어 있음을 나타낸다.
				graph.get(point1).add(point2);
				graph.get(point2).add(point1);
			}
			
			set = new int[V];
			for(int i = 0; i < V; i++) {
				if(set[i] == 0) {
					if(!bfs(i)) break;
				}
			}
			System.out.println(answer);
			K--;
		}
	}
	
	public static boolean bfs(int n) {
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.add(n);
		set[n] = 1;
		
		while(!queue.isEmpty()) {
			n = queue.poll();
			for(Integer i: graph.get(n)) {
				if(set[n] == set[i]) {
					answer = "NO";
					return false;
				}
				if(set[i] == 0) {
					set[i] = set[n] * -1;
					queue.add(i);
				}
			}
		}
		return true;
	}
}
