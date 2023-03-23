package Sorting;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Sorting_05800 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int K = Integer.parseInt(br.readLine());
		
		
		for(int i = 1; i <= K; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			int length = Integer.parseInt(st.nextToken());
			int[] array = new int[length];
			int max = Integer.MIN_VALUE;
			
			for(int j = 0; j < length; j++) {
				
				array[j] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(array);
			
			for(int j = 0; j < length - 1; j++) {
				
				if(max < Math.abs(array[j] - array[j + 1])) {
					
					max = Math.abs(array[j] - array[j + 1]);
				}
			}
		
			sb.append("Class " + i + "\nMax " + array[length - 1] + ", Min " + array[0] + ", Largest gap " + max + "\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}
