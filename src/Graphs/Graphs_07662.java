package Graphs;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.TreeMap;

public class Graphs_07662 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= T; i++) {
			int n = Integer.parseInt(br.readLine());
			TreeMap<Integer, Integer> que = new TreeMap();
			
			for(int j = 0; j < n; j++) {
				String[] input = br.readLine().split(" ");
				char operation = input[0].charAt(0);
				int num = Integer.parseInt(input[1]);
				
				if(operation == 'I') {
					que.put(num, que.getOrDefault(num, 0) + 1);
				}else {
					if(que.size() == 0) continue;
					
					int check = num == 1 ? que.lastKey() : que.firstKey();
					if(que.put(check, que.get(check) - 1) == 1) que.remove(check);
				}
			}
			
			sb.append(que.size() == 0 ? "EMPTY" : que.lastKey() + " " + que.firstKey()).append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}
