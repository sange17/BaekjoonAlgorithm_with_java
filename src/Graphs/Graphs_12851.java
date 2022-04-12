package Graphs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class Graphs_12851 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		boolean[] visited = new boolean[100001];
		int[] cntArray = new int[100001];
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(N);
		visited[N] = true;
		cntArray[N] = 0;
		
		while(!queue.isEmpty()) {
			int now = queue.remove();
			
			if(now + 1 < 100001) {
				
			}
		}
	}
}
