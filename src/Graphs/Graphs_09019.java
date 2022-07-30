package Graphs;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Graphs_09019 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			boolean[] visited = new boolean[10000];
			visited[A] = true;
			
			Queue<Register> que = new LinkedList<>();
			que.add(new Register(A,""));
			
			while(!que.isEmpty()) {
				Register current = que.poll();
				
				if(current.num == B) {
					sb.append(current.command + "\n");
					break;
				}
				
				if(!visited[current.D()]) {
					que.add(new Register(current.D(), current.command + "D"));
					visited[current.D()] = true;
				}
				if(!visited[current.S()]) {
					que.add(new Register(current.S(), current.command + "S"));
					visited[current.S()] = true;
				}
				if(!visited[current.L()]) {
					que.add(new Register(current.L(), current.command + "L"));
					visited[current.L()] = true;
				}
				if(!visited[current.R()]) {
					que.add(new Register(current.R(), current.command + "R"));
					visited[current.R()] = true;
				}
			}
		}
		
		System.out.println(sb.toString());
	}
	
	static class Register{
		int num;
		String command;
		
		public Register(int num, String command) {
			this.num = num;
			this.command = command;
		}
		
		int D() {
			return (num * 2) % 10000;
		}
		
		int S() {
			return num == 0 ? 9999 : num - 1;
		}
		
		int L() {
			return num % 1000 * 10 + num / 1000;
		}
		
		int R() {
			return num % 10 * 1000 + num /10;
		}
	}
}
