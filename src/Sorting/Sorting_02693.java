package Sorting;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Sorting_02693 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		int[] array = new int[10];
		for(int i = 0; i < T; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			for(int j = 0; j < 10; j++) {
				
				array[j] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(array);
			
			sb.append(array[7] + "\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}
