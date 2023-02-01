package Sorting.copy;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.BufferedReader;

public class Sorting_11931 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		int[] array = new int[N];
		
		for(int i = 0; i < N; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(array);
		
		for(int i = N - 1; i >= 0; i--) {
			sb.append(array[i] + "\n");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
