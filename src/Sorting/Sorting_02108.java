package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Sorting_02108 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
				
		int n = Integer.parseInt(br.readLine());
		float sum = 0;
		String mean = "";
		int mid = 0;
		int mode = 0;
		int range = 0;
		
		int array[] = new int[n];
		for(int i = 0; i < n; i++) {
			int a = Integer.parseInt(br.readLine());
			array[i] = a;
			sum += a;
		}
		
		Arrays.sort(array);
		
		int count = 0;
		for(int i = 0; i < n - 1; i++) {
			for(int j = i + 1; j < n; j++) {
				if(array[i] == array[j]) {
					count++;
					i++;
				}
			}
		}
		
		mean = String.format("%.0f", sum / n);
		sb.append(mean).append("\n");
		mid = array[array.length / 2];
		sb.append(mid).append("\n");
		
		range = array[array.length - 1] - array[0];
		sb.append(range);
		
		System.out.println(sb);
		br.close();
	}
}
