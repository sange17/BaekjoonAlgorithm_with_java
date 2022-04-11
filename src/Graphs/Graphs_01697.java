package Graphs;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Queue;

public class Graphs_01697 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		boolean[] visited = new boolean[100001];
		int[] cntArray = new int[1000001];
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(N);
		visited[N] = true;
		cntArray[N] = 0;
		
		while(!queue.isEmpty()) {
			int now = queue.remove();
			
			if(now + 1 < 100001) {
				if(visited[now + 1] == false) {
					queue.add(now + 1);
					visited[now + 1] = true;
					cntArray[now + 1] = cntArray[now] + 1;					
				}
			}
			
			if(now - 1 >= 0) {
				if(visited[now - 1] == false) {
					queue.add(now - 1);
					visited[now - 1] = true;
					cntArray[now - 1] = cntArray[now] + 1;
				}
			}
			
			if(now * 2 < 100001) {
				if(visited[now * 2] == false) {
					queue.add(now * 2);
					visited[now * 2] = true;
					cntArray[now * 2] = cntArray[now] + 1;
				}
			}
		}
		
		System.out.println(cntArray[K]);
		br.close();
	}
}
