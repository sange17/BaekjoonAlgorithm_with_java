package Graphs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Graphs_16953 {
	static long a, b;
	static int count;
	
	static int bfs() {
		Queue<Long> queue = new LinkedList<>();
		queue.add(a);
		
		while(!queue.isEmpty()) {
			int size = queue.size();
			
			for(int i = 0; i < size; i++) {
				long tmp = queue.poll();
				if(tmp == b) return count + 1;
				
				if(tmp * 2 <= b) queue.add(tmp * 2);
				if(tmp * 10 + 1 <= b) queue.add(tmp * 10 + 1);
			}
			count++;
		}
		return -1;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		a = Long.parseLong(st.nextToken());
		b = Long.parseLong(st.nextToken());
		
		System.out.println(bfs());
	}
}
