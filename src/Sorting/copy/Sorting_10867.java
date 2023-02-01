package Sorting.copy;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Sorting_10867 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		int num = 0;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			
			num = Integer.parseInt(st.nextToken());
			
			map.put(num, map.getOrDefault(num, 1));
		}
		
		Object[] keyArray = map.keySet().toArray();
		Arrays.sort(keyArray);
		
		int length = keyArray.length;
		for(int i = 0; i < length; i++) {
			sb.append(keyArray[i] + " ");
		}
		
		System.out.println(sb);
	}
}
