package Sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Sorting_09076 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		int[] array = new int[5];
		for(int i = 0; i < T; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			for(int j = 0; j < 5; j++) {
				
				array[j] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(array);
			
			if(Math.abs(array[1] - array[3]) >= 4) {
				
				sb.append("KIN\n");
			}else {
				
				sb.append(array[1] + array[2] + array[3] + "\n");
			}
		}
		
		System.out.println(sb);
		br.close();
	}
}
