package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Sorting_05635 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		String name = "";
		int day = 0;
		int month = 0;
		int year = 0;
		int maxYear = 0;
		int maxMonth = 0;
		int maxDay = 0;
		String maxName;
		String minName;
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i < n; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			name = st.nextToken();
			day = Integer.parseInt(st.nextToken());
			month = Integer.parseInt(st.nextToken());
			year = Integer.parseInt(st.nextToken());
			
			map.put(name, 0);
			
			
		}
		
		
		
	}
}
