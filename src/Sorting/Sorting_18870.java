package Sorting;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Sorting_18870 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] array = new int[N];
		int[] sortArray = new int[N];
		for(int i = 0; i < N; i++) {
			array[i] = Integer.parseInt(st.nextToken());
			sortArray[i] = array[i];
		}
		
		Arrays.sort(sortArray);
		
		Map<Integer, Integer> map = new HashMap<>();
		int index = 0;
		for(int i = 0; i < N; i++) {
			if(!map.containsKey(sortArray[i]))
				map.put(sortArray[i], index++);
		}
		
		for(int i = 0; i < N; i++) {
			sb.append(map.get(array[i])).append(' ');
		}
		
		System.out.println(sb.toString());
	}
}
