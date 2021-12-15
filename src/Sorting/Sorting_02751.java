package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sorting_02751 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		boolean[] array = new boolean[2000001];
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			array[Integer.parseInt(br.readLine()) + 1000000] = true;
		}
		
		for(int i = 0; i < array.length; i++) {
			if(array[i]) {
				sb.append(i - 1000000).append("\n");
			}
		}
		
		System.out.println(sb);
	}
}