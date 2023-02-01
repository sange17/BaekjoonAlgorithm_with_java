package Sorting.copy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sorting_10989 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		int[] array = new int[n];
		int[] counting = new int[10001];
		int[] result = new int[n];
		
		for(int i = 0; i < n; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 0; i < array.length; i++) {
			counting[array[i]]++;			
		}
		
		for(int i = 1; i < counting.length; i++) {
			counting[i] += counting[i - 1];
		}
		
		for(int i = array.length - 1; i >= 0; i--) {
			int value = array[i];
			counting[value]--;
			result[counting[value]] = value;
		}
		
		for(int i = 0; i < result.length; i++) {
			sb.append(result[i]).append('\n');
		}
		
		System.out.print(sb);
	}
}
