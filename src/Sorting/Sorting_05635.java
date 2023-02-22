package Sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Sorting_05635 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		String name = "";
		String s_day = "";
		String s_month = "";
		String s_year = "";
		
		PriorityQueue<String> priorityQueueLowest = new PriorityQueue<>();
		PriorityQueue<String> priorityQueueHighest = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i = 0; i < n; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			name = st.nextToken();
			s_day = String.format("%02d", Integer.parseInt(st.nextToken()));
			s_month = String.format("%02d", Integer.parseInt(st.nextToken()));
			s_year = st.nextToken();
			
			priorityQueueLowest.add(s_year + "." + s_month + "." + s_day + "." + name);
			priorityQueueHighest.add(s_year + "." + s_month + "." + s_day + "." + name);
		}
		
		System.out.println(priorityQueueHighest.peek().substring(11));
		System.out.println(priorityQueueLowest.peek().substring(11));
		br.close();
	}
}
