package Graphs;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;

public class Graphs_11725 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		List<Integer>[] list = new ArrayList[T+1];
		for(int i = 0; i < list.length; i++) {
			list[i] = new ArrayList<Integer>();
		}
		
		for(int i = 0; i < T-1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			list[a].add(b);
			list[b].add(a);
		}
		
		boolean[] visited = new boolean[T+1];
		int answer[] = new int[T+1];
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(1);
		visited[1] = true;
		while(!queue.isEmpty()) {
			int num = queue.poll();
			for(int i : list[num]) {
				if(!visited[i]) {
					visited[i] = true;
					answer[i] = num;
					queue.add(i);
				}
			}
		}
		
		for(int i = 2; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
		br.close();
	}
}
